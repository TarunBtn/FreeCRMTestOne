package com.crm.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class MatchPage extends TestBase{
	//Page factory or Object repository
	@FindBy(xpath="//*[@id=\"dropdown-assignment\"]/div/div[1]")
	WebElement valueFilterDropdown;
	
	@FindBy(xpath="//*[@id=\"assignments-2\"]/span/span")
	WebElement selectValueFilter;
				
	@FindBy(xpath="//*[@id=\"filter\"]/div[1]/div/span")
	WebElement clickCancelValueFilter;
				
	@FindBy(xpath="//*[@id=\"dropdown-assignment\"]/div/div[1]")
	WebElement clickAssignmentDropDown;
				
	@FindBy(xpath="//*[@id=\"dropdown-assignment\"]/div/div[3]/ul/li[7]/span/span")
	WebElement selectAssignmentValue;
			
	@FindBy(xpath="//*[@id=\"dropdown-assignment\"]/span")
	WebElement cancelAssignment;
			
	@FindBy(xpath="//*[@id=\"dropdown-beschikbaar\"]/button")
	WebElement availabilityDropDown;
			
	@FindBy(xpath="//*[@id=\"post-zichtbaarheidvanpost\"]/form/div[2]/label")
	WebElement selectOnlyAvailable;
			
	@FindBy(xpath="//*[@id=\"post-zichtbaarheidvanpost\"]/form/div[3]/label")
	WebElement selectNotAvailable;
			
	@FindBy(xpath="//*[@id=\"post-zichtbaarheidvanpost\"]/form/div[1]/label")
	WebElement selectEverything;
			
	@FindBy(id="dropdown-location")
	WebElement location;
			
	@FindBy(id="map")
	WebElement enterLocation;
			
	@FindBy(id="dropdown-location-and-distance-apply")
	WebElement applyFilter;
			
	@FindBy(id="dropdown-location-and-distance-reset")
	WebElement resetFilter;
			
	@FindBy(id="dropdown-location-and-distance-cancel")
	WebElement clickCancel;
			
	@FindBy(id="dropdown-work-btn")
	WebElement workThinkingLevelDropDown;
			
	@FindBy(xpath="//*[@id=\"dropdown-work-thinking-level\"]/div/form/div[4]/label")
	WebElement selectWorkThinkingLevel;
			
	@FindBy(id="dropdown-uren-btn")
	WebElement hours;
			
	@FindBy(xpath="//*[@id=\"dropdown-uren\"]/div/form/div[1]/div/div[2]/div[2]/div[1]")
	WebElement selectHours;
			
	@FindBy(id="dropdown-uren-apply")
	WebElement clickApplyFilterHours;
			
	@FindBy(id="dropdown-uren-reset")
	WebElement resetFilterHours;
			
	@FindBy(id="dropdown-uren-cancel")
	WebElement cancelHours;
			
	@FindBy(xpath="//*[@id=\"dropdown-vakgebied\"]/button")
	WebElement descipline;
			
	@FindBy(xpath="//*[@id=\"dropdown-vakgebied\"]/div/form/div[8]/label")
	WebElement selectDescipline;
			
	@FindBy(xpath="//*[@id=\"dropdown-skills-btn\"]")
	WebElement skill;
			
	@FindBy(xpath="/html/body/div[1]/div/div[1]/main/div/nav/div[2]/div/div[2]/div[6]/div/form/div[1]/div/div/input")
	WebElement enterValueSkill;
			
	@FindBy(xpath="/html/body")
	WebElement selectTooltipSkill;
			
	@FindBy(xpath="//*[@id=\"dropdown-skills\"]/div/form/div[4]/button")
	WebElement applyFilterSkill;
			
	@FindBy(xpath="//*[@id=\"dropdown-skills\"]/div/form/div[4]/a[2]")
	WebElement resetFilterSkill;
			
	@FindBy(xpath="//*[@id=\"dropdown-skills\"]/div/form/div[4]/a[1]")
	WebElement cancelSkill;
			
	@FindBy(xpath="//*[@id=\"toggle-saved\"]/button")
	WebElement stored;
			
	@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div/select")
	WebElement sorting;
	
	@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div/select/option[1]")
	WebElement matchBasedOnSkill;
	
	@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div/select/option[2]")
	WebElement locationone;
	
	@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div/select/option[3]")
	WebElement alphabeticallyAZ;
	
	@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div/select/option[4]")
	WebElement alphabeticallyZA;
	
	@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div/select/option[5]")
	WebElement hourlyRateMinMax;
	
	@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div/select/option[6]")
	WebElement hourlyRateMaxMin;
	
	@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div/select/option[7]")
	WebElement numberOfHoursMinMax;
	
	@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div/select/option[8]")
	WebElement numberOfHoursMaxMin;
			
	//Initialization
	public MatchPage() {
		PageFactory.initElements(Driver, this);
	}
			
	//Actions
	public void clickValueFilterDropdown() {
		valueFilterDropdown.click();
	}
			
	public void selectValueFilter() {
		selectValueFilter.click();
	}
			
	public void clickCancelValueFilter() {
		clickCancelValueFilter.click();
	}
			
	public void clickAssignmentDropDown() {
		clickAssignmentDropDown.click();
	}
			
	public void selectAssignmentValue() {
		selectAssignmentValue.click();
	}
			
	public void clickCancelAssignmentValue() {
		cancelAssignment.click();
	}
			
	public void clickAvailabilityDropDown() {
		availabilityDropDown.click();
	}
			
	public void selectOnlyAvailable() {
		selectOnlyAvailable.click();
	}
			
	public void selectNotAvailable() {
		selectNotAvailable.click();
	}
			
	public void selectEverything() {
		selectEverything.click();
	}
			
	public void clickLocationDropDown() {
		location.click();
	}
			
	public void enterLocationValue(String value) {
		enterLocation.sendKeys(value);
	}
			
	public void clickApplyFilterLocation() {
		applyFilter.click();
	}
			
	public void resetFilterLocation() {
		resetFilter.click();
	}
			
	public void clickCancelLocation() {
		clickCancel.click();
	}
			
	public void clickWorkThinkingLevelDropDown() {
		workThinkingLevelDropDown.click();
	}
				
	public void selectWorkThinking() {
		selectWorkThinkingLevel.click();
	}
				
	public void clickHoursDropDown() {
		hours.click();	
	}
			
	public void selectHours() {
		selectHours.click();
	}
			
	public void clickApplyFilterHours() {
		clickApplyFilterHours.click();
	}
			
	public void clickResetFilterHours() {
		resetFilterHours.click();
	}
			
	public void clickCancelHours() {
		cancelHours.click();
	}
			
	public void clickDesciplineDropDown() {
		descipline.click();
	}
			
	public void selectDescipline() {
		selectDescipline.click();
	}
			
	public void clickSkillTab() {
		skill.click();
	}
			
	public void clickEnterValueSkill() {
		enterValueSkill.click();
	}
			
	public void enterValueSkill(String value) {
		enterValueSkill.sendKeys(value);
	}
	
	public void enterValueSkillTab() {
		enterValueSkill.sendKeys(Keys.TAB);
	}
			
	public void selectTooltipSkill() {
		selectTooltipSkill.click();
	}
			
	public void clickApplyFilterSkill() {
		applyFilterSkill.click();
	}
			
	public void clickResetFilterSkill() {
		resetFilterSkill.click();
	}
			
	public void clickCancelSkill() {
		cancelSkill.click();
	}
			
	public void clickStored() {
		stored.click();
	}
	
	public void selectMatchBasedOnSkill() {
		matchBasedOnSkill.click();
	}
	
	public void selectLocation() {
		locationone.click();
	}
	
	public void selectAlphabeticallyAZ() {
		alphabeticallyAZ.click();
	}
	
	public void selectAlphabeticallyZA() {
		alphabeticallyZA.click();
	}
	
	public void selectHourlyRateMinMax() {
		hourlyRateMinMax.click();
	}
	
	public void selectHourlyRateMaxMin() {
		hourlyRateMaxMin.click();
	}
	
	public void selectNumberOfHoursMinMax() {
		numberOfHoursMinMax.click();
	}
	
	public void selectNumberOfHoursMaxMin() {
		numberOfHoursMaxMin.click();
	}
}
