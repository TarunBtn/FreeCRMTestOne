package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePageAdmin;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.UlogoMyprofilePage;
import com.crm.qa.util.TestUtil;

public class UlogoMyprofilePageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoMyprofilePage uLogoMyprofilePage;
	TestUtil testUtil;
	
	public UlogoMyprofilePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoMyprofilePage=new UlogoMyprofilePage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		//homePageAdmin.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitEight();
		homePageAdmin.clickMyProfileTab();
		testUtil.testWaitEight();
		//homePageAdmin.moveHoverTologoImage();
		//testUtil.testWaitFour();
		
	}
	
	@Test
	public void UlogoMyProfilePage()throws Exception {
		//Edit profile-General Tab 
		uLogoMyprofilePage.clickEditYourProfile();
		testUtil.testWaitFourteen();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();		
		//uLogoMyprofilePage.clickChangeMyGeneralInformation();
		//testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		//uLogoMyprofilePage.clickChangeMyGeneralInformationCancel();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitFour();
		//uLogoMyprofilePage.clickFillInCompany();
		//testUtil.testWaitFour();
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
		//uLogoMyprofilePage.clickFillInCompanyCancel();
		//testUtil.testWaitFour();
		//Skill Tab
		uLogoMyprofilePage.clickSkillsTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		//Enter skill value
		/*uLogoMyprofilePage.enterSkillsValue("Account");
		testUtil.testWaitEight();
		uLogoMyprofilePage.selectSkillsValue();
		testUtil.testWaitFour();
		//Save additional skills
		uLogoMyprofilePage.clickSaveAdditionalSkills();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//Remove skills
		uLogoMyprofilePage.clickRemoveSkills();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickDeleteSkills();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();*/
		//Work experience
		uLogoMyprofilePage.clickWorkExperienceTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickAddWorkExperience();
		testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		uLogoMyprofilePage.enterFunction("DBA");
		testUtil.testWaitFour();
		uLogoMyprofilePage.enterCompany("TCS");
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickTypeWorkExperience();
		testUtil.testWaitFour();
		uLogoMyprofilePage.selectTypeWorkExperience();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickTypeWorkExperience();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.enterDescription("This is test data");
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickStartDateCalender();
		testUtil.testWaitFour();
		//uLogoMyprofilePage.selectStartYear();
		//testUtil.testWaitFour();
		//uLogoMyprofilePage.selectStartYear();
		//testUtil.testWaitTwo();
		//uLogoMyprofilePage.selectStartYear();
		//testUtil.testWaitTwo();
		uLogoMyprofilePage.selectStartDate();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickEndDateCalender();
		testUtil.testWaitFour();
		uLogoMyprofilePage.selectEndDate();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.enterProfile("Database administrator");
		testUtil.testWaitFourteen();
		uLogoMyprofilePage.selectProfile();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickSaveBtn();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//uLogoMyprofilePage.clickEditWorkExperience();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		uLogoMyprofilePage.deleteWorkExperience();
		testUtil.testWaitEight();
		uLogoMyprofilePage.clickDeleteWorkExperience();
		testUtil.testWaitEight();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitFour();
		//Upload CV
		uLogoMyprofilePage.clickUploadCV();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickChooseFile();
		testUtil.testWaitEight();
		testUtil.uploadFile("D:\\CV Jort Zwolsman.doc");
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickUploadFile();
		testUtil.testWaitEight();
		//uLogoMyprofilePage.clickUpdateMyProfile();
		//testUtil.testWaitFour();
		uLogoMyprofilePage.clickCancelUploadCV();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		//Educations Tab
		uLogoMyprofilePage.clickEducationsTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickAddEducations();
		testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		uLogoMyprofilePage.enterFieldOfStudy("Computer Science");
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickEducationLevel();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.selectEducationLevel();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickEducationLevel();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickStartingYear();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.selectStartingYear();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickStartingYear();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickSaveBtnOne();
		testUtil.testWaitEleven();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		/*uLogoMyprofilePage.clickEditEducations();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickDeleteEducations();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickConfirmDeleteEducations();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();*/
		//Courses Tab
		uLogoMyprofilePage.clickCoursesTab();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickAddCourse();
		testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		uLogoMyprofilePage.enterCourse("Data Security");
		testUtil.testWaitTwo();
		uLogoMyprofilePage.enterDescriptionCourse("This is test data");
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickCompletedOnDateCourse();
		testUtil.testWaitFour();
		uLogoMyprofilePage.selectCompletedOnDateCourse();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickSaveCourse();
		testUtil.testWaitEight();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//uLogoMyprofilePage.clickEditCourse();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//uLogoMyprofilePage.clickDeleteCourse();
		//testUtil.testWaitFour();
		//uLogoMyprofilePage.clickConfirmDeleteCourse();
		//testUtil.testWaitFour();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		uLogoMyprofilePage.clickInstitutionsTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
