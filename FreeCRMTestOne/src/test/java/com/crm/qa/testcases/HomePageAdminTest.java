package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AssignmentsPageAdmin;
import com.crm.qa.pages.HomePageAdmin;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageAdminTest extends TestBase{

	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	AssignmentsPageAdmin assignmentsPageAdmin;
	TestUtil testUtil;
	
	public HomePageAdminTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		assignmentsPageAdmin=new AssignmentsPageAdmin();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitEight();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEight();
	}
	
	@Test
	public void test()throws Exception {
		//testUtil.testWaitEight();
		assignmentsPageAdmin=homePageAdmin.clickAssignmentsTab();
		testUtil.testWaitFour();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}
}
