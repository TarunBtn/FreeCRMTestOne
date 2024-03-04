package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class UlogoMyreactionsPage extends TestBase{
	//Page factory OR Object Repository
	@FindBy(xpath="//input[contains(@id,'status')]")
	WebElement clickStatusDropDown;
	
	@FindBy(xpath="//li[contains(@id, 'status-1')]")
	WebElement selectStatusNew;
	
	@FindBy(xpath="//li[contains(@id, 'status-2')]")
	WebElement selectStatusIntreatment;
	
	@FindBy(xpath="//li[contains(@id, 'status-3')]")
	WebElement selectStatusOninterview;
	
	@FindBy(xpath="//li[contains(@id, 'status-4')]")
	WebElement selectStatusRegisteragreement;
	
	@FindBy(xpath="//li[contains(@id, 'status-5')]")
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
