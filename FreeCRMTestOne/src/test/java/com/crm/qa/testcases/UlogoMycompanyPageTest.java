package com.crm.qa.testcases;

import org.openqa.selenium.TimeoutException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePageAdmin;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.UlogoMycompanyPage;
import com.crm.qa.util.TestUtil;

public class UlogoMycompanyPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	TestUtil testUtil;
	UlogoMycompanyPage uLogoMycompanyPage;
	
	public UlogoMycompanyPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		testUtil=new TestUtil();
		uLogoMycompanyPage=new UlogoMycompanyPage();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		try {
		    homePageAdmin.clickMyCompanyTab();
		    testUtil.testWaitFourteen();
		}catch(TimeoutException e) {
			e.printStackTrace();
		}
		testUtil.testWaitEleven();
		//homePageAdmin.moveHoverTologoImage();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		
	}
	
	@Test
	public void uLogoMycompanyPage()throws Exception {
		uLogoMycompanyPage.clickAddNewCompany();
		testUtil.testWaitEight();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		uLogoMycompanyPage.enterCompanyName("Coffeeshop Checkpoint");
		testUtil.testWaitEight();
		uLogoMycompanyPage.clickCompanyNameTooltip();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		uLogoMycompanyPage.clickEmployeeDropDown();
		testUtil.testWaitTwo();
		uLogoMycompanyPage.selectEmployee();
		testUtil.testWaitFour();
		uLogoMycompanyPage.clickEmployeeDropDown();
		testUtil.testWaitTwo();
		uLogoMycompanyPage.clickSectorDropDown();
		testUtil.testWaitFour();
		uLogoMycompanyPage.selectSector();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMycompanyPage.clearWebsiteField();
		testUtil.testWaitTwo();
		uLogoMycompanyPage.enterWebsiteUrl("https://coffeshopcheckpoint.com");
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitEight();
		//uLogoMycompanyPage.clickSaveBtn();
		uLogoMycompanyPage.clickCancelBtn();
		testUtil.testWaitFour();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
