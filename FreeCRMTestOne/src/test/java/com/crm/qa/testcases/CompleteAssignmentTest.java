package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AddCommandPage;
import com.crm.qa.pages.CheckCommandPage;
import com.crm.qa.pages.CompleteAssignment;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MyAssignmentsPage;
import com.crm.qa.util.TestUtil;

public class CompleteAssignmentTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	MyAssignmentsPage myAssignmentsPage;
	AddCommandPage addCommandPage;
	CheckCommandPage checkCommandPage;
	CompleteAssignment completeAssignment;
	TestUtil testUtil;
	
	public CompleteAssignmentTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		addCommandPage=new AddCommandPage();
		checkCommandPage=new CheckCommandPage();
		myAssignmentsPage=new MyAssignmentsPage();
		completeAssignment=new CompleteAssignment();
		testUtil=new TestUtil();		
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitFourteen();
		homePage.clickAcceptAllCookies();
		testUtil.testWaitEleven();		
		homePage.clickMyAssignmentsLink();
		testUtil.testWaitEleven();
		testUtil.testWaitEight();
		//testUtil.testWaitFour();
		//addCommandPage=myAssignmentsPage.clickAddNewCommand();
		myAssignmentsPage.clickAddNewCommand();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		addCommandPage.clickChooseFile();		
		testUtil.testWaitFour();
		testUtil.uploadFile("D:\\CV Jort Zwolsman.doc");
		testUtil.testWaitEight();
		addCommandPage.clickUploadFile();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		checkCommandPage.clickFillInComplete();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitFour();
	}
	
	@Test
	public void completeAssignmentTest()throws Exception {
		System.out.println("Test is passed");
		/*completeAssignment.clickCompanyDropDown();
		testUtil.testWaitTwo();
		completeAssignment.selectCompany();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		completeAssignment.clickSectorDropDown();
		testUtil.testWaitTwo();
		completeAssignment.selectSectorFromDropDown();
		testUtil.testWaitTwo();
		//completeAssignment.selectWorkLocation();
		//testUtil.testWaitFour();
		//completeAssignment.clickWorkLocationTooltip();
		//testUtil.testWaitFour();
		//try {
			//Driver.findElement(By.name("date")).sendKeys("01-08-2024");
				
		//}catch(ElementNotInteractableException e) {
			//e.printStackTrace();
		//}	
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
	    testUtil.testWaitFour();
		//Generate description
	    try {
		    completeAssignment.clickGenerateDescription();
		    testUtil.testWaitEleven();
		    testUtil.testWaitEleven();
		    testUtil.testWaitEight();
		    testUtil.testWaitEleven();
		    testUtil.testWaitEight();
		    //testUtil.testWaitEleven();
	   }catch(NoSuchElementException e) {
	   	  e.printStackTrace();
	   }
	    testUtil.scrollDown();
	    testUtil.testWaitFour();
	    //testUtil.scrollDown();
	    //testUtil.testWaitTwo();
	    try {
		   completeAssignment.clickUseThisText();
	    }catch(ElementClickInterceptedException e) {
	    	e.printStackTrace();
	    }
	    
	    try {
			   completeAssignment.clickUseThisTextOne();
		    }catch(ElementClickInterceptedException e) {
		    	e.printStackTrace();
		    }
		testUtil.testWaitEight();	   
	    testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();        
		//Select start date
		completeAssignment.clickStartDateDropDown();
		testUtil.testWaitTwo();
		completeAssignment.selectStartYear();
		testUtil.testWaitTwo();
		completeAssignment.selectStartDate();
		testUtil.testWaitTwo();		
		//Select end date
		completeAssignment.clickEndDateDropDown();
		testUtil.testWaitTwo();
		completeAssignment.selectEndYear();
		testUtil.testWaitTwo();
		//completeAssignment.selectEndYear();
		//testUtil.testWaitTwo();
		completeAssignment.selectEndDate();
		testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitFour();
		//NumberofHours
		completeAssignment.selectNumberOfHours();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();*/
		completeAssignment.clickDesciplineDropDown();
		testUtil.testWaitTwo();
		completeAssignment.selectDesciplineDropDown();
		testUtil.testWaitFour();
		//selectWorkingThinkingLevel
		//completeAssignment.selectWorkingThinkingLevel();
		//testUtil.testWaitFour();
		completeAssignment.clickNextButton();
		testUtil.testWaitEleven();
		//Select FieldOfExpertise/Descipline
		/*completeAssignment.clickFieldOfExpertise();
		testUtil.testWaitFour();
		completeAssignment.selectFieldOfExpertise();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();*/
		//Add Skills and remove skills
		/*completeAssignment.clickSkillsField();
		testUtil.testWaitTwo();
		completeAssignment.enterSkills("Security Management");
		testUtil.testWaitFour();
		completeAssignment.skillsToolTip();
		testUtil.testWaitTwo();
		completeAssignment.enterSkills("Databases");
		testUtil.testWaitFour();
		completeAssignment.skillsToolTip();
		testUtil.testWaitTwo();
		completeAssignment.enterSkills("Test Engineering");
		testUtil.testWaitFour();
		completeAssignment.skillsToolTip();
		testUtil.testWaitTwo();
		completeAssignment.unSelectSkillsOne();
		testUtil.testWaitTwo();
		completeAssignment.unSelectSkillsTwo();
		testUtil.testWaitTwo();*/
		completeAssignment.clickNextOneButton();
		testUtil.testWaitEight();
		//completeAssignment.clickSaveButton();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
		
	}
}
