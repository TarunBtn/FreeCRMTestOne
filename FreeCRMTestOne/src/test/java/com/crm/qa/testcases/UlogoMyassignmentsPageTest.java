package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePageAdmin;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MyAssignmentsPage;
import com.crm.qa.pages.UlogoMyassignmentsPage;
import com.crm.qa.util.TestUtil;

public class UlogoMyassignmentsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	MyAssignmentsPage myAssignmentsPage;
	UlogoMyassignmentsPage uLogoMyassignmentsPage;
	TestUtil testUtil;
	
	public UlogoMyassignmentsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		myAssignmentsPage=new MyAssignmentsPage();
		uLogoMyassignmentsPage=new UlogoMyassignmentsPage();
		testUtil=new TestUtil();
		testUtil.testWaitTwo();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		//homePageAdmin.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickMyAssignmentsTab();
		testUtil.testWaitEight();
		//homePageAdmin.moveHoverTologoImage();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitFour();
			
	}
	
	@Test
	public void UlogoMyassignmentsPage()throws Exception {
		myAssignmentsPage.clickChooseCompanyDropDown();
		testUtil.testWaitTwo();
		myAssignmentsPage.selectCompanyFromDropDown();
		testUtil.testWaitFour();
		myAssignmentsPage.clickChooseCompanyDropDown();
		testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		myAssignmentsPage.clickCommentsLink();
		testUtil.testWaitTwo();
		//testUtil.scrollRight();
		//testUtil.testWaitTwo();
		//myAssignmentsPage.clickScrollRight();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitFour();
		myAssignmentsPage.clickStatusThumbsup();
		testUtil.testWaitEleven();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		myAssignmentsPage.clickPendingTab();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		myAssignmentsPage.clickEntrepreneurCheckbox();
		testUtil.testWaitTwo();
		myAssignmentsPage.clickEntrepreneurDropDown();
		testUtil.testWaitTwo();
		myAssignmentsPage.selectStatusEntrepreneur();
		testUtil.testWaitTwo();
		myAssignmentsPage.clickEntrepreneurDropDown();
		testUtil.testWaitTwo();
		myAssignmentsPage.updateStatusEntrepreneur();
		testUtil.testWaitEight();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		myAssignmentsPage.clickNewTab();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
