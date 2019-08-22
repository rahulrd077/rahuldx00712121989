package com.Scneider.Xyphias.Xyphias_webappNew;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Scneider.Xyphias.TestBase.TestBaseDotNew;

public class ContactsPageDotNew extends TestBaseDotNew{
	
////select[@name='title']
	
	////input[@id='first_name']
	
	////input[@id='middle_initial']
	
	////input[@id='surname']
	
	////input[@name='client_lookup']
	
	////input[contains(@value,'Save')]
	
	
	@FindBy(xpath="//select[@name='title']")
	WebElement Title;
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='middle_initial']")
	WebElement MiddleName;
	
	@FindBy(xpath="//input[@id='surname']")
	WebElement LastName;
	 
	@FindBy(xpath="//input[@name='client_lookup']")
	WebElement CompanyName;
	
	@FindBy(xpath="//input[contains(@value,'Save')]")
	WebElement SubmitContactDetails;
	
	public ContactsPageDotNew(){
		
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyContactsPageTitle() {
		
		return driver.getTitle();
	}

	public void EnterTheContactDetails(String Titles , String Firstname ,String MidName ,String SurName, String ClientName) {
		Select sel = new Select(this.Title);
		
		sel.selectByVisibleText(Titles);
		
		this.FirstName.sendKeys(Firstname);
		
		this.MiddleName.sendKeys(MidName);
		
		this.LastName.sendKeys(SurName);
		
		this.CompanyName.sendKeys(ClientName);
		
		this.SubmitContactDetails.click();
		
		
		
	}
	
	
}
