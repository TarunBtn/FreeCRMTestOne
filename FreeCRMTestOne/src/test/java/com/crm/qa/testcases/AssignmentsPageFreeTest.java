package com.crm.qa.testcases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AssignmentsPageFree;
import com.crm.qa.pages.HomePageFree;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class AssignmentsPageFreeTest extends TestBase{
	LoginPage loginPage;
	HomePageFree homePageFree;
	AssignmentsPageFree assignmentsPageFree;
	TestUtil testUtil;
	
	public AssignmentsPageFreeTest() {
		super();
	}
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();		
		assignmentsPageFree=new AssignmentsPageFree();
		testUtil=new TestUtil();
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
		homePageFree.clickAssignmentsLink();
		testUtil.testWaitFourteen();
			
	}
	
	//public void assignmentsPageTitleTest()throws Exception {
		//String title=assignmentsPageFree.assignmentsPageTitle();
		//Assert.assertEquals(title, "Opdrachten - Younited®");
		//testUtil.testWaitTwo();
	//}
	
	@Test
	public void clickFiltersTest()throws Exception {
		//Sector
		assignmentsPageFree.clickSectorTab();
		testUtil.testWaitFour();
		assignmentsPageFree.selectSector();
		testUtil.testWaitEight();
		assignmentsPageFree.selectSector();
		testUtil.testWaitEight();
		//Descipline
		assignmentsPageFree.clickDescipline();
		testUtil.testWaitFour();
		assignmentsPageFree.selectDescipline();
		testUtil.testWaitEight();
		assignmentsPageFree.selectDescipline();
		testUtil.testWaitEight();
		//Skill
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.enterSkill();
		testUtil.testWaitFour();
		assignmentsPageFree.enterSkillValue("Postman");
		testUtil.testWaitEight();
		//assignmentsPageFree.selectSkillToolTip();
		//testUtil.testWaitFour();
		assignmentsPageFree.applySkillFilter();
		testUtil.testWaitEight();
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitFour();
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitFour();
		assignmentsPageFree.clickClearFilterSkill();
		testUtil.testWaitEight();
		assignmentsPageFree.clickCancelSkill();
		testUtil.testWaitFour();
		//Duration
		assignmentsPageFree.clickDuration();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectDuration();
		testUtil.testWaitFour();
		assignmentsPageFree.clickDuration();
		testUtil.testWaitTwo();	
		assignmentsPageFree.clickDuration();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectDuration();
		testUtil.testWaitFour();
		assignmentsPageFree.clickDuration();
		testUtil.testWaitFour();
		//WorkAndThinkingLevel
		assignmentsPageFree.clickWorkAndThinkingLevel();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectWorkAndThinkingLevel();
		testUtil.testWaitFour();
		assignmentsPageFree.clickWorkAndThinkingLevel();
		testUtil.testWaitTwo();
		assignmentsPageFree.clickWorkAndThinkingLevel();
		testUtil.testWaitFour();
		assignmentsPageFree.selectWorkAndThinkingLevel();
		testUtil.testWaitFour();
		assignmentsPageFree.clickWorkAndThinkingLevel();
		testUtil.testWaitFour();
		//Hours
		assignmentsPageFree.clickHoursTab();
		testUtil.testWaitFour();
		assignmentsPageFree.selectHours();
		testUtil.testWaitFour();
		assignmentsPageFree.applyHoursFilter();
		testUtil.testWaitEight();
		assignmentsPageFree.clickHoursTab();
		testUtil.testWaitFour();
		assignmentsPageFree.resetHoursFilter();
		testUtil.testWaitEight();
		assignmentsPageFree.clickHoursTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.clickCancelHours();
		testUtil.testWaitFour();
		//Hourly rate
		assignmentsPageFree.clickHourlyRateTab();
		testUtil.testWaitFour();
		assignmentsPageFree.selectHourlyRate();
		testUtil.testWaitFour();
		assignmentsPageFree.applyHourlyRateFilter();
		testUtil.testWaitEight();
		assignmentsPageFree.clickHourlyRateTab();
		testUtil.testWaitFour();
		assignmentsPageFree.resetHourlyRateFilter();
		testUtil.testWaitEight();
		assignmentsPageFree.clickHourlyRateTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.clickCancelHourlyRate();
		testUtil.testWaitTwo();
		//Location
		assignmentsPageFree.clickLocationTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.locationRemove();
		testUtil.testWaitFour();
		assignmentsPageFree.enterLocation("Noordwijk, Netherlands");
		testUtil.testWaitFour();
		assignmentsPageFree.enterLocationToolTip();
		testUtil.testWaitFour();
		assignmentsPageFree.applyLocationFilter();
		testUtil.testWaitEight();
		assignmentsPageFree.clickLocationTab();
		testUtil.testWaitFour();
		assignmentsPageFree.resetLocation();
		testUtil.testWaitEight();
		//assignmentsPageFree.clickLocationTab();
		//testUtil.testWaitTwo();
		//assignmentsPageFree.clickCancelLocation();
		//testUtil.testWaitTwo();
		//View matches
		assignmentsPageFree.clickViewMatches();
		testUtil.testWaitFour();
		assignmentsPageFree.clickViewMatches();
		testUtil.testWaitFour();
		//Favourites
		assignmentsPageFree.clickFavorites();
		testUtil.testWaitFour();
		assignmentsPageFree.clickFavorites();
		testUtil.testWaitFour();
		//Sorting
		assignmentsPageFree.clickSortingDropDown();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectPublicationDateOldFirst();
		testUtil.testWaitEight();
		assignmentsPageFree.selectAtHourlyRate();
		testUtil.testWaitEight();
		assignmentsPageFree.selectByNumberOfHours();
		testUtil.testWaitEight();
		assignmentsPageFree.selectPublicationDateNewFirst();
		testUtil.testWaitEight();
		assignmentsPageFree.clickSortingDropDown();
		testUtil.testWaitFour();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
		
	}	

}
