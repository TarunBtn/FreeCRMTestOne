package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class UlogoMyreactionsPage extends TestBase{
	//Page factory OR Object Repository
	@FindBy(xpath="//div[@class='multiselect__select']")
	WebElement clickStatusDropDown;
	
	@FindBy(xpath="//span[text()='Nieuw']")
	WebElement selectStatusNew;
	
	@FindBy(xpath="//span[text()='In behandeling']")
	WebElement selectStatusIntreatment;
	
	@FindBy(xpath="//span[text()='Op gesprek']")
	WebElement selectStatusOninterview;
	
	@FindBy(xpath="//span[text()='Overeenkomst aanmelden']")
	WebElement selectStatusRegisteragreement;
	
	@FindBy(xpath="//span[text()='Ingetrokken/afgewezen']")
	WebElement selectStatusWithdrawnRejected;
	
	//Initialization
	public UlogoMyreactionsPage() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void clickStatusDropDown() {
		clickStatusDropDown.click();
	}
	
	public void selectStatusNew() {
		selectStatusNew.click();
	}
	
	public void selectStatusIntreatment() {
		selectStatusIntreatment.click();
	}
	
	public void selectStatusOninterview() {
		selectStatusOninterview.click();
	}
	
	public void selectStatusRegisterAgreement() {
		selectStatusRegisteragreement.click();
	}
	
	public void selectStatusWithdrawnRejected() {
		selectStatusWithdrawnRejected.click();
	}

}
