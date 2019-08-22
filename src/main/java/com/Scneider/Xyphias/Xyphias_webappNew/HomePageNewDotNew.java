package com.Scneider.Xyphias.Xyphias_webappNew;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Scneider.Xyphias.TestBase.TestBaseDotNew;

public class HomePageNewDotNew extends TestBaseDotNew{
	
	@FindBy(xpath="//td[contains(text(),'User: Rahul Das')]")
	WebElement HomePageDotNewTestlabel;
	
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
   WebElement ClickonContactsLink;
	
	
	@FindBy (xpath = "//a[contains(text(),'New Contact')]")
	WebElement ClickonNewContactsLink;
	
	
	
	public HomePageNewDotNew() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyHomePageNewDotNewTitle() {
		
		return driver.getTitle();
	}
	
	
	public boolean VerifyHomePageNewDotNewUserLabel() {
		
		
		return this.HomePageDotNewTestlabel.isDisplayed();
	}
	
	
	public ContactsPageDotNew ClickonContactsLinkFromHomePage() {
		
		this.ClickonContactsLink.click();
		
		return new ContactsPageDotNew();
	}

	
	public void ClickonNewContactsLinkFromHomePage() {
		
		Actions action = new Actions(driver);
		
		action.moveToElement(this.ClickonContactsLink).build().perform();
		
		this.ClickonNewContactsLink.click();
	}
}
