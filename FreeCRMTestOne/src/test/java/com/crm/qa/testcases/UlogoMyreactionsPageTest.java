package com.crm.qa.testcases;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.TimeoutException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePageAdmin;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.UlogoMyreactionsPage;
import com.crm.qa.util.TestUtil;

public class UlogoMyreactionsPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoMyreactionsPage uLogoMyreactionsPage;
	TestUtil testUtil;
	
	public UlogoMyreactionsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoMyreactionsPage=new UlogoMyreactionsPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		try {
		    homePageAdmin.clickMyReactionsTab();
		    testUtil.testWaitFourteen();
		}catch(ElementClickInterceptedException e) {
			e.printStackTrace();
		}
		testUtil.testWaitEight();
		
	}
	
	@Test
	public void uLogoMyreactionsPageTest()throws Exception {
		uLogoMyreactionsPage.clickStatusDropDown();
		testUtil.testWaitEight();
		uLogoMyreactionsPage.selectStatusNew();
		testUtil.testWaitEight();
		uLogoMyreactionsPage.clickStatusDropDown();
		testUtil.testWaitFour();
		uLogoMyreactionsPage.selectStatusIntreatment();
		testUtil.testWaitEight();
		uLogoMyreactionsPage.clickStatusDropDown();
		testUtil.testWaitFour();
		uLogoMyreactionsPage.selectStatusOninterview();
		testUtil.testWaitEight();
		uLogoMyreactionsPage.clickStatusDropDown();
		testUtil.testWaitFour();
		uLogoMyreactionsPage.selectStatusRegisterAgreement();
		testUtil.testWaitEight();
		uLogoMyreactionsPage.clickStatusDropDown();
		testUtil.testWaitFour();
		uLogoMyreactionsPage.selectStatusWithdrawnRejected();
		testUtil.testWaitEight();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
