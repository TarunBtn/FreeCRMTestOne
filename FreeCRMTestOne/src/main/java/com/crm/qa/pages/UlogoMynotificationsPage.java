package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class UlogoMynotificationsPage extends TestBase{
	
	//PageFactory or Object Repository
	@FindBy(xpath="//*[@id=\"message0\"]/div")
	WebElement clickOpenMail;
	
	//Initialization
	public UlogoMynotificationsPage() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void ClickToOpenMail() {
		clickOpenMail.click();
	}

}
