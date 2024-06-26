package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.HomePageFree;
//import com.crm.qa.pages.HomePageFree;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MyAssignmentsPage;
//import com.crm.qa.pages.MyAssignmentsPage;
import com.crm.qa.util.TestUtil;


public class HomePageTest extends TestBase{	
	LoginPage loginPage;
	HomePage homePage;
	HomePageFree homePageFree;
	MyAssignmentsPage myAssignmentsPage;
	TestUtil testUtil;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		//Driver.quit();
		initialization();
		loginPage=new LoginPage();
		homePageFree=new HomePageFree();
		myAssignmentsPage=new MyAssignmentsPage();
		testUtil=new TestUtil();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));		
		testUtil.testWaitFourteen();
		homePage.clickAcceptAllCookies();
		testUtil.testWaitEleven();
				
	}
	
	@Test(priority=1)
	public void homePageTitleTest()throws Exception {
		String title=homePage.verifyHomePageTitle();
		testUtil.testWaitFour();
		Assert.assertEquals(title, "Younited®");
		testUtil.testWaitFour();
	}
	
	@Test(priority=2)
	public void verifyImageLogoTest()throws Exception {
		Boolean logo=homePage.verifyImageLogo();
		testUtil.testWaitFour();
		Assert.assertTrue(logo);
		testUtil.testWaitFour();
	}
	
	@Test(priority=3)
	public void clickMyAssignmentsLinkTest()throws Exception {
		myAssignmentsPage=homePage.clickMyAssignmentsLink();
		testUtil.testWaitFour();
	}
	
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
