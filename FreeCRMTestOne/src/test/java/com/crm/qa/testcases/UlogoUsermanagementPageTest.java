package com.crm.qa.testcases;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePageAdmin;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.UlogoUsermanagementPage;
import com.crm.qa.util.TestUtil;

public class UlogoUsermanagementPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoUsermanagementPage uLogoUsermanagementPage;
	TestUtil testUtil;
	WebDriverWait wait;
	
	public UlogoUsermanagementPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoUsermanagementPage=new UlogoUsermanagementPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		//homePageAdmin.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitEight();
		try {
		    homePageAdmin.clickUserManagementTab();
		    testUtil.testWaitFourteen();
		}catch(TimeoutException e) {
			e.printStackTrace();
		}
		testUtil.testWaitEight();
		//testUtil.testWaitEight();
		//wait.until(ExpectedConditions.elementToBeClickable("searchName"));
		//testUtil.testRefresh();
		//testUtil.testWaitFourteen();
		//homePageAdmin.moveHoverTologoImage();
		//testUtil.testWaitFour();
		
	}
	
	@Test
	public void uLogoUsermanagementPageTest()throws Exception {
		//System.out.println("Test is passed");
		uLogoUsermanagementPage.clickSearchName();
		testUtil.testWaitEight();
		uLogoUsermanagementPage.enterSearchName("Ajay");
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.clickResetSearchName();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.enterEmailAddress("tb+acc-freelancer@test.nowonline.nl");
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.clickExactSearch();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.clickExactSearch();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.clickResetEmailAddress();
		testUtil.testWaitFour();
		//Roles
		uLogoUsermanagementPage.clickRoleDropDown();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.selectRole();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.clickRoleDropDown();
		testUtil.testWaitTwo();
		//Availability
		uLogoUsermanagementPage.clickEverythingDropDown();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.selectOnlyAvailable();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.clickEverythingDropDown();
		testUtil.testWaitTwo();
		//Descipline
		uLogoUsermanagementPage.clickDesciplineDropDown();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.selectDescipline();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.clickDesciplineDropDown();
		testUtil.testWaitTwo();
		//ElevatorPitch
		uLogoUsermanagementPage.clickElevatorPitch();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.clickElevatorPitch();
		testUtil.testWaitEight();
		uLogoUsermanagementPage.clickDesciplineDropDown();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.selectDescipline();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.clickDesciplineDropDown();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.clickEverythingDropDown();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.selectEverything();
		testUtil.testWaitEight();
		uLogoUsermanagementPage.clickRoleDropDown();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.selectResetRole();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.clickRoleDropDown();
		testUtil.testWaitTwo();
		//Skills
		uLogoUsermanagementPage.clickSkillsTab();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.enterValueSkills("Postman");
		testUtil.testWaitFour();
		uLogoUsermanagementPage.selectTooltipSkills();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.clickSkillsTab();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.clickApplyFilterSkills();
		testUtil.testWaitEight();
		uLogoUsermanagementPage.clickResetFilterSkills();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.clickSkillsTab();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.clickCancelSkills();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
