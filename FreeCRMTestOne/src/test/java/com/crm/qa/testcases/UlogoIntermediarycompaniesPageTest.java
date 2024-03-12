package com.crm.qa.testcases;

import org.openqa.selenium.TimeoutException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePageAdmin;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.UlogoAllcompaniesPage;
import com.crm.qa.pages.UlogoIntermediarycompaniesPage;
import com.crm.qa.pages.UlogoMycompanyPage;
import com.crm.qa.util.TestUtil;


public class UlogoIntermediarycompaniesPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoAllcompaniesPage uLogoAllcompaniesPage;
	UlogoMycompanyPage uLogoMycompanyPage;
	UlogoIntermediarycompaniesPage uLogoIntermediarycompanyPage;
	TestUtil testUtil;
	
	public UlogoIntermediarycompaniesPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception{
		initialization();
		loginPage=new LoginPage();
		uLogoAllcompaniesPage=new UlogoAllcompaniesPage();
		uLogoMycompanyPage=new UlogoMycompanyPage();
		uLogoIntermediarycompanyPage=new UlogoIntermediarycompaniesPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		//homePageAdmin.clickUserLogoPhoto();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		try {
		    homePageAdmin.clickNativeCompanyTab();
		    testUtil.testWaitFourteen();
		}catch(TimeoutException e) {
			e.printStackTrace();
		}
		testUtil.testWaitEleven();
		//homePageAdmin.moveHoverTologoImage();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitFour();
		//homePageAdmin.clickNativeCompanyTab();
		//testUtil.testWaitFour();
	}
	
	@Test
	public void UlogoIntermediarycompanyPage()throws Exception {
		//uLogoIntermediarycompanyPage.enterSearchCompany("SilverTouch");
		uLogoMycompanyPage.enterSearchCompany("SilverTouch");
		testUtil.testWaitEight();
		//uLogoIntermediarycompanyPage.clickSearchCompany();
		//testUtil.testWaitTwo();
		//uLogoIntermediarycompanyPage.clickCancelSearch();
		//testUtil.testWaitTwo();
		//Add new company
		uLogoMycompanyPage.clickAddNewCompany();
		testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		uLogoMycompanyPage.enterCompanyName("SilverTouch");
		testUtil.testWaitEight();
		uLogoMycompanyPage.clickCompanyNameTooltip();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//uLogoIntermediarycompanyPage.aboutYourCompany("Testdata");
		//testUtil.testWaitFour();
		uLogoMycompanyPage.clickEmployeeDropDown();
		testUtil.testWaitTwo();
		uLogoMycompanyPage.selectEmployee();
		testUtil.testWaitFour();
		//Sector
		uLogoMycompanyPage.clickSectorDropDown();
		testUtil.testWaitFour();
		uLogoMycompanyPage.selectSector();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//Enter website
		uLogoMycompanyPage.clearWebsiteField();
		testUtil.testWaitTwo();
		uLogoMycompanyPage.enterWebsiteUrl("https://silvertouch.com/");
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//Save company
		//uLogoMycompanyPage.clickSaveBtn();
		//testUtil.testWaitEight();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitFour();
		uLogoMycompanyPage.clickCancelBtn();
		testUtil.testWaitEight();
		//Edit company
		/*uLogoIntermediarycompanyPage.clickEditBtn();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//uLogoIntermediarycompanyPage.clearCompanyName();
		//testUtil.testWaitTwo();
		//uLogoIntermediarycompanyPage.enterCompanyName("One");
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//Save
		//uLogoIntermediarycompanyPage.clickSaveBtnEdit();
		uLogoIntermediarycompanyPage.clickEditCancel();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();*/
		//Delete Company
		  //uLogoIntermediarycompanyPage.clickDeleteSign();
		  //testUtil.testWaitEight();
		//uLogoIntermediarycompanyPage.clickDeleteCompany();
		  //uLogoIntermediarycompanyPage.clickCancelDelete();
		  //testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitFour();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
