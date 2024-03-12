package com.crm.qa.testcases;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.BusinessesPageFree;
import com.crm.qa.pages.HomePageFree;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class BusinessesPageFreeTest extends TestBase{	
	LoginPage loginPage;
	HomePageFree homePageFree;
	BusinessesPageFree businessesPageFree;
	TestUtil testUtil;
	
	public BusinessesPageFreeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		businessesPageFree=new BusinessesPageFree();
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
		testUtil.testWaitFour();
		try {
		    homePageFree.clickBusinessesTab();
		    testUtil.testWaitFourteen();
		}catch(ElementNotInteractableException e) {
			e.printStackTrace();
		}
		testUtil.testWaitEleven();
				
	}
	
	@Test
	public void businessesPageFree()throws Exception {
		//Filter value
		businessesPageFree.filterValue("Apex");
		testUtil.testWaitEleven();
		businessesPageFree.filterValueTooltip();
		testUtil.testWaitEight();
		businessesPageFree.removeFilter();
		testUtil.testWaitEleven();
		//Sector-field removed
		//businessesPageFree.clickSector();
		//testUtil.testWaitTwo();
		//businessesPageFree.selectSector();
		//testUtil.testWaitFour();
		//businessesPageFree.clickSector();
		//testUtil.testWaitTwo();
		//businessesPageFree.clickSector();
		//testUtil.testWaitTwo();
		//businessesPageFree.selectSector();
		//testUtil.testWaitFour();
		//businessesPageFree.clickSector();
		//testUtil.testWaitTwo();
		businessesPageFree.clickSortingDropDown();
		testUtil.testWaitFour();
		businessesPageFree.sortingZtoA();
		testUtil.testWaitEight();
		businessesPageFree.sortingLocationAtoZ();
		testUtil.testWaitEight();
		businessesPageFree.sortingLocationZtoA();
		testUtil.testWaitEight();
		businessesPageFree.sortingAtoZ();
		testUtil.testWaitEight();
		businessesPageFree.clickSortingDropDown();
		testUtil.testWaitFour();
		
	}
	
	@AfterMethod
	public void tearDown(){
		Driver.quit();
		
	}

}
