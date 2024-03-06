package com.crm.qa.testcases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePageFree;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.StorePageFree;
import com.crm.qa.util.TestUtil;

public class StorePageFreeTest extends TestBase{
	LoginPage loginPage;
	HomePageFree homePageFree;
	StorePageFree storePageFree;
	TestUtil testUtil;
	
	
	public StorePageFreeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		testUtil=new TestUtil();
		storePageFree=new StorePageFree();
		homePageFree=loginPage.loginHomePageFree(prop.getProperty("usernameone"), prop.getProperty("passwordone"));
		testUtil.testWaitFourteen();
		homePageFree.clickAcceptAllCookies();
		testUtil.testWaitEleven();
		try {
		    homePageFree.suitableAssignments();
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		testUtil.testWaitFour();
		homePageFree.clickNetworkTab();
		testUtil.testWaitFour();
		homePageFree.clickStoreTooltip();
		testUtil.testWaitEleven();
		//testUtil.testWaitEight();
		//testUtil.testWaitEleven();
		
	}
	
	@Test
	public void clickStoreTab()throws Exception {
		storePageFree.clickAllTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//storePageFree.clickMoreInformationAll();
		//testUtil.testWaitFour();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		//storePageFree.clickBackToAllProductsLink();
		//testUtil.testWaitFour();
		storePageFree.clickBookKeepingTab();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		//storePageFree.clickMoreInformationAccounting();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitFour();
		//storePageFree.clickBackToAllProductsLink();
		//testUtil.testWaitFour();
		storePageFree.clickCTATestGroupTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		//storePageFree.clickMoreInformationCTA();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitFour();
		//storePageFree.clickBackToAllProductsLink();
		//testUtil.testWaitFour();
		storePageFree.clickDemoTrainingTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		//storePageFree.clickMoreInformationDemoTraining();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitFour();
		//storePageFree.clickBackToAllProductsLink();
		//testUtil.testWaitFour();
		storePageFree.clickDevelopmentTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		//storePageFree.clickMoreInformationDevelopment();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitFour();
		//storePageFree.clickBackToAllProductsLink();
		//testUtil.testWaitFour();
		storePageFree.clickTestTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		//storePageFree.clickMoreInformationTest();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitFour();
		//storePageFree.clickBackToAllProductsLink();
		//testUtil.testWaitFour();
		storePageFree.clickTestUrlTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		//storePageFree.clickInsurancesTab();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitFour();
		//testUtil.scrollUp();
		//testUtil.testWaitFour();
			
	}
	
	@AfterMethod
	public void tearDown(){
		Driver.quit();
	}

}
