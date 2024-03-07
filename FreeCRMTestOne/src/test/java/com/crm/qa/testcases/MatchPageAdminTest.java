package com.crm.qa.testcases;

import org.openqa.selenium.ElementNotInteractableException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePageAdmin;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MatchPageAdmin;
import com.crm.qa.util.TestUtil;

public class MatchPageAdminTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	MatchPageAdmin matchPageAdmin;
	TestUtil testUtil;
	
	
	public MatchPageAdminTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		matchPageAdmin=new MatchPageAdmin();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEleven();
		try {
		    homePageAdmin.clickMatchTab();
		}catch(ElementNotInteractableException e) {
			e.printStackTrace();
		}
		testUtil.testWaitEleven();	
		
	}
	
	@Test
	public void match()throws Exception {
		//Value Filter
		matchPageAdmin.clickValueFilter();
		testUtil.testWaitEleven();
		matchPageAdmin.enterValueFilter("Ajay");
		testUtil.testWaitEleven();
		matchPageAdmin.clickCancelValueFilter();
		testUtil.testWaitEleven();
		//Select Command
		matchPageAdmin.clickAssignmentDropDown();
		testUtil.testWaitTwo();
		matchPageAdmin.selectAssignmentValue();
		testUtil.testWaitEight();
		matchPageAdmin.clickCancelAssignmentValue();
		testUtil.testWaitEight();
		//Availability
		matchPageAdmin.clickAvailabilityDropDown();
		testUtil.testWaitTwo();
		matchPageAdmin.selectOnlyAvailable();
		testUtil.testWaitEight();
		matchPageAdmin.selectNotAvailable();
		testUtil.testWaitEight();
		matchPageAdmin.selectEverything();
		testUtil.testWaitEight();
		matchPageAdmin.clickAvailabilityDropDown();
		testUtil.testWaitTwo();
		//Location
		matchPageAdmin.clickLocationDropDown();
		testUtil.testWaitTwo();
		matchPageAdmin.enterLocationValue("Noordwijk, Netherlands");
		testUtil.testWaitTwo();
		matchPageAdmin.clickApplyFilterLocation();
		testUtil.testWaitEight();
		matchPageAdmin.clickLocationDropDown();
		testUtil.testWaitTwo();
		matchPageAdmin.resetFilterLocation();
		testUtil.testWaitEight();
		matchPageAdmin.clickLocationDropDown();
		testUtil.testWaitTwo();
		matchPageAdmin.clickCancelLocation();
		testUtil.testWaitTwo();
		//Work/Thinking level
		matchPageAdmin.clickWorkThinkingLevelDropDown();
		testUtil.testWaitTwo();
		matchPageAdmin.selectWorkThinking();
		testUtil.testWaitEight();
		matchPageAdmin.clickWorkThinkingLevelDropDown();
		testUtil.testWaitFour();
		matchPageAdmin.clickWorkThinkingLevelDropDown();
		testUtil.testWaitTwo();
		matchPageAdmin.selectWorkThinking();
		testUtil.testWaitEight();
		matchPageAdmin.clickWorkThinkingLevelDropDown();
		testUtil.testWaitTwo();		
		//Hours
		matchPageAdmin.clickHoursDropDown();
		testUtil.testWaitTwo();
		matchPageAdmin.selectHours();
		testUtil.testWaitEight();
		matchPageAdmin.clickApplyFilterHours();
		testUtil.testWaitEight();
		matchPageAdmin.clickHoursDropDown();
		testUtil.testWaitTwo();
		matchPageAdmin.clickResetFilterHours();
		testUtil.testWaitEight();
		matchPageAdmin.clickHoursDropDown();
		testUtil.testWaitTwo();
		matchPageAdmin.clickCancelHours();
		testUtil.testWaitTwo();
		//Descipline
		matchPageAdmin.clickDesciplineDropDown();
		testUtil.testWaitTwo();
		matchPageAdmin.selectDescipline();
		testUtil.testWaitEight();
		matchPageAdmin.selectDescipline();
		testUtil.testWaitEight();
		matchPageAdmin.clickDesciplineDropDown();
		testUtil.testWaitTwo();
		//Skills
		matchPageAdmin.clickSkillTab();
		testUtil.testWaitTwo();		
		matchPageAdmin.clickEnterValueSkill();
		testUtil.testWaitTwo();
		matchPageAdmin.enterValueSkill("Postman");
		testUtil.testWaitFour();
		matchPageAdmin.selectTooltipSkill();
		testUtil.testWaitFour();
		matchPageAdmin.clickSkillTab();
		testUtil.testWaitFour();
		matchPageAdmin.clickApplyFilterSkill();
		testUtil.testWaitEleven();
		matchPageAdmin.clickResetFilterSkill();
		testUtil.testWaitEleven();
		matchPageAdmin.clickSkillTab();
		testUtil.testWaitTwo();
		matchPageAdmin.clickCancelSkill();
		testUtil.testWaitTwo();
		//Stored
		matchPageAdmin.clickStored();
		testUtil.testWaitEight();
		matchPageAdmin.clickStored();
		testUtil.testWaitEight();
		//Sorting
		matchPageAdmin.selectProfileCompleted();
		testUtil.testWaitEight();
		matchPageAdmin.selectLocation();
		testUtil.testWaitEight();
		matchPageAdmin.selectAlphabeticallyAZ();
		testUtil.testWaitEight();
		matchPageAdmin.selectAlphabeticallyZA();
		testUtil.testWaitEight();
		matchPageAdmin.selectHourlyRateMinMax();
		testUtil.testWaitEight();
		matchPageAdmin.selectHourlyRateMaxMin();
		testUtil.testWaitEight();
		matchPageAdmin.selectNumberOfHoursMinMax();
		testUtil.testWaitEight();
		matchPageAdmin.selectNumberOfHoursMaxMin();
		testUtil.testWaitEight();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}
	
}
