package com.crm.qa.testcases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CommunityPageFree;
import com.crm.qa.pages.HomePageFree;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MyNetworkPageFree;
import com.crm.qa.util.TestUtil;

public class CommunityPageFreeTest extends TestBase{	
	LoginPage loginPage;
	HomePageFree homePageFree;
	CommunityPageFree communityPageFree;
	MyNetworkPageFree myNetworkPageFree;
	TestUtil testUtil;
	
	public CommunityPageFreeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		communityPageFree=new CommunityPageFree();
		myNetworkPageFree=new MyNetworkPageFree();
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
		homePageFree.clickNetworkTab();
		testUtil.testWaitFour();
		homePageFree.clickNetworkTabTooltip();
		testUtil.testWaitEleven();
								
	}
	
	@Test
	public void communityPageFreeTest()throws Exception {
		communityPageFree.clickTypeOfMessageDropDown();
		testUtil.testWaitEight();
		communityPageFree.selectTypeOfMessage();
		testUtil.testWaitEight();
		communityPageFree.selectTypeOfMessage();
		testUtil.testWaitEight();
		communityPageFree.clickTypeOfMessageDropDown();
		testUtil.testWaitFour();
		communityPageFree.clickAreaOfInterestDropDown();
		testUtil.testWaitFour();
		communityPageFree.selectAreaOfInterestDropDown();
		testUtil.testWaitFour();
		communityPageFree.selectAreaOfInterestDropDown();
		testUtil.testWaitFour();
		communityPageFree.clickAreaOfInterestDropDown();
		testUtil.testWaitFour();
		communityPageFree.clickSectorTab();
		testUtil.testWaitFour();
		communityPageFree.selectSector();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		communityPageFree.selectSector();
		testUtil.testWaitFour();
		communityPageFree.clickSectorTab();
		testUtil.testWaitFour();
		communityPageFree.clickEveryoneDropDown();
		testUtil.testWaitFour();
		communityPageFree.selectMyOwnNetwork();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		communityPageFree.selectEveryoneNetwork();
		testUtil.testWaitFour();
		communityPageFree.clickEveryoneDropDown();
		testUtil.testWaitFour();
		communityPageFree.clickFouriteMessage();
		testUtil.testWaitFour();
		communityPageFree.clickFouriteMessage();
		testUtil.testWaitFour();
		//communityPageFree.clickMyNetworkBtn();
					
	}
	
	@AfterMethod
	public void tearDown(){
		Driver.quit();
		
	}

}
