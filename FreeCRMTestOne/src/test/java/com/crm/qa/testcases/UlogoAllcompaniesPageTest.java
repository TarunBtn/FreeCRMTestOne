package com.crm.qa.testcases;

import org.openqa.selenium.TimeoutException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePageAdmin;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.UlogoAllcompaniesPage;
import com.crm.qa.pages.UlogoMycompanyPage;
import com.crm.qa.util.TestUtil;

public class UlogoAllcompaniesPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoMycompanyPage uLogoMycompanyPage;
	UlogoAllcompaniesPage uLogoAllcompaniesPage;
	TestUtil testUtil;
	
	public UlogoAllcompaniesPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception{
		initialization();
		loginPage=new LoginPage();
		uLogoMycompanyPage=new UlogoMycompanyPage();
		uLogoAllcompaniesPage=new UlogoAllcompaniesPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitEight();
		try {
		    homePageAdmin.clickAllCompaniesTab();
		    testUtil.testWaitFourteen();
		}catch(TimeoutException e) {
			e.printStackTrace();
		}
		//homePageAdmin.moveHoverTologoImage();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
								
	}
	
	@Test
	public void UlogoAllcompaniesPage()throws Exception {
		//System.out.println("Test is passed");
		//Company verified
		uLogoAllcompaniesPage.clickVerifiedCompanyDropDown();
		testUtil.testWaitTwo();
		uLogoAllcompaniesPage.selectVerifiedCompany();
		testUtil.testWaitEight();		
		uLogoAllcompaniesPage.selectNotVerifiedCompany();
		testUtil.testWaitEight();	
		uLogoAllcompaniesPage.selectAllCompany();
		testUtil.testWaitEight();
		uLogoAllcompaniesPage.clickVerifiedCompanyDropDown();
		testUtil.testWaitFour();
		//Search Deleted company
		uLogoAllcompaniesPage.clickSearchDeletedCompany();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.clickSearchDeletedCompany();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.enterValueCompanyFilter("Silver");
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		//Exact match
		uLogoAllcompaniesPage.clickExactMatch();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.clickExactMatch();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.clickResetCompanyFilter();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		//AddNewCompany
		uLogoAllcompaniesPage.clickAddNewCompany();
		testUtil.testWaitEight();
		uLogoAllcompaniesPage.enterCompanyName("Cybage");
		testUtil.testWaitEight();
		uLogoAllcompaniesPage.selectCompanyTooltip();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoAllcompaniesPage.clickEmployeeDropDown();
		testUtil.testWaitTwo();
		uLogoAllcompaniesPage.selectEmployees();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.clickEmployeeDropDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoAllcompaniesPage.clickSectorDropDown();
		testUtil.testWaitTwo();
		uLogoAllcompaniesPage.selectSectorCompany();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.clearWebsiteField();
		testUtil.testWaitTwo();
		uLogoAllcompaniesPage.enterWebsite("https://cybage.com");
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//uLogoAllcompaniesPage.clickSaveBtn();
		uLogoAllcompaniesPage.clickCancelBtn();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMycompanyPage.clickDeleteCompanySign();
		testUtil.testWaitFour();
		//System.out.println(uLogoAllcompaniesPage.companyLink());
		//testUtil.testWaitFour();
		//if(uLogoAllcompaniesPage.companyLink().equals("Cybage Software B.V.")) {
			//testUtil.testWaitTwo();
		//uLogoMycompanyPage.clickDeleteCompany();
		uLogoMycompanyPage.clickCancelDelete();
		testUtil.testWaitFour();
			//testUtil.testWaitEight();
		//}else {
			//System.out.println("Company name not exist");
		//}
					
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
