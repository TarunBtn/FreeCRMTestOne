package com.crm.qa.testcases;

import org.openqa.selenium.TimeoutException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePageAdmin;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.UlogoAllassignmentsPage;
import com.crm.qa.util.TestUtil;

public class UlogoAllassignmentsPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoAllassignmentsPage uLogoAllassignmentsPage;
	TestUtil testUtil;
	
	public UlogoAllassignmentsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception{
		initialization();
		loginPage=new LoginPage();
		uLogoAllassignmentsPage=new UlogoAllassignmentsPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		//homePageAdmin.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitEight();
		try {
		    homePageAdmin.clickAllassignmentsTab();
		    testUtil.testWaitFourteen();
		}catch(TimeoutException e) {
			e.printStackTrace();
		}
		testUtil.testWaitEleven();
		//homePageAdmin.moveHoverTologoImage();
		//testUtil.testWaitFour();
		
	}
	
	@Test
	public void UlogoAllassignmentsPage()throws Exception {
		//System.out.println("Test is passed");
		uLogoAllassignmentsPage.clickSearchCompanyField();
		testUtil.testWaitEight();
		uLogoAllassignmentsPage.enterSearchCompany("QA EngineerEight");
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		uLogoAllassignmentsPage.clickExactSearch();
		testUtil.testWaitFour();
		uLogoAllassignmentsPage.clickExactSearch();
		testUtil.testWaitFour();
		uLogoAllassignmentsPage.clickResetCompany();
		testUtil.testWaitFour();
		uLogoAllassignmentsPage.clickFilterDropDown();
		testUtil.testWaitTwo();
		uLogoAllassignmentsPage.selectFilterDropDown();
		testUtil.testWaitEight();
		uLogoAllassignmentsPage.clickStatusDropDown();
		testUtil.testWaitFour();
		uLogoAllassignmentsPage.selectStatusDropDown();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
			
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
