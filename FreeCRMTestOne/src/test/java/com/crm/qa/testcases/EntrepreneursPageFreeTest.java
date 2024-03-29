package com.crm.qa.testcases;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.EntrepreneursPageFree;
import com.crm.qa.pages.HomePageFree;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class EntrepreneursPageFreeTest extends TestBase{	
	LoginPage loginPage;
	HomePageFree homePageFree;
	TestUtil testUtil;
	EntrepreneursPageFree entrepreneursPageFree;
	
	public EntrepreneursPageFreeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		testUtil=new TestUtil();
		entrepreneursPageFree=new EntrepreneursPageFree();
		homePageFree=loginPage.loginHomePageFree(prop.getProperty("usernameone"), prop.getProperty("passwordone"));
		testUtil.testWaitFourteen();
		homePageFree.clickAcceptAllCookies();
		testUtil.testWaitEleven();
		try {
		    homePageFree.suitableAssignments();
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		testUtil.testWaitEight();
		try {
		    homePageFree.clickEntrepreneurTab();
		    testUtil.testWaitFourteen();
		}catch(ElementNotInteractableException e) {
			e.printStackTrace();
		}
		testUtil.testWaitFourteen();
				
	}
	
	@Test
	public void entrepreneurPageFilter()throws Exception {
		entrepreneursPageFree.enterEntrepreneur("Ajay");
		testUtil.testWaitEight();
		entrepreneursPageFree.clickCancel();
		testUtil.testWaitEight();
		//Working/Thinking level
		entrepreneursPageFree.clickWorkingThinkingDropDown();
		testUtil.testWaitTwo();
		entrepreneursPageFree.selectWorkingThinkingLevel();
		testUtil.testWaitFour();
		entrepreneursPageFree.selectWorkingThinkingLevel();
		testUtil.testWaitFour();
		entrepreneursPageFree.clickWorkingThinkingDropDown();
		testUtil.testWaitTwo();
		//Descipline
		entrepreneursPageFree.clickDesciplineDropDown();
		testUtil.testWaitTwo();
		entrepreneursPageFree.selectDescipline();
		testUtil.testWaitFour();
		entrepreneursPageFree.selectDescipline();
		testUtil.testWaitFour();
		entrepreneursPageFree.clickDesciplineDropDown();
		testUtil.testWaitTwo();
		//Area of Interest
		entrepreneursPageFree.clickAreaOfInterestDropDown();
		testUtil.testWaitTwo();
		entrepreneursPageFree.selectAreaOfInterest();
		testUtil.testWaitFour();
		entrepreneursPageFree.selectAreaOfInterest();
		testUtil.testWaitFour();
		entrepreneursPageFree.clickAreaOfInterestDropDown();
		testUtil.testWaitTwo();
		//Skills
		entrepreneursPageFree.clickSkillsTab();
		testUtil.testWaitTwo();
		entrepreneursPageFree.enterSkill();
		testUtil.testWaitTwo();
		entrepreneursPageFree.enterSkill("Postman");
		testUtil.testWaitFour();
		entrepreneursPageFree.selectSkillToolTip();
		testUtil.testWaitFour();
		entrepreneursPageFree.clickSkillsTab();
		testUtil.testWaitTwo();
		entrepreneursPageFree.clickApplyFilter();
		testUtil.testWaitFour();
		entrepreneursPageFree.clickResetFilter();
		testUtil.testWaitFour();
		entrepreneursPageFree.clickSortingDropDown();
		testUtil.testWaitTwo();
		entrepreneursPageFree.selectSortingZtoA();
		testUtil.testWaitFour();
		entrepreneursPageFree.selectSortingAtoZ();
		testUtil.testWaitFour();
		entrepreneursPageFree.clickSortingDropDown();
		testUtil.testWaitTwo();
		
	}
	
	@AfterMethod
	public void tearDown(){
		Driver.quit();
	}

}
