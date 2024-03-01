package com.crm.qa.testcases;

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
		testUtil.testWaitEight();
		}catch(TimeoutException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void uLogoMyreactionsPageTest()throws Exception {
		//try {
		uLogoMyreactionsPage.clickStatusDropDown();
		testUtil.testWaitFour();
		uLogoMyreactionsPage.selectStatusNew();
		testUtil.testWaitEight();
		uLogoMyreactionsPage.selectStatusIntreatment();
		testUtil.testWaitEight();
		uLogoMyreactionsPage.selectStatusOninterview();
		testUtil.testWaitEight();
		uLogoMyreactionsPage.selectStatusRegisterAgreement();
		testUtil.testWaitEight();
		uLogoMyreactionsPage.selectStatusWithdrawnRejected();
		testUtil.testWaitEight();
		//}catch(TimeoutException e) {
			//e.printStackTrace();
		//}
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
