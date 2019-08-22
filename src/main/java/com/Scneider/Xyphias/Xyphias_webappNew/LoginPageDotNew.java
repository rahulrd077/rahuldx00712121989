package com.Scneider.Xyphias.Xyphias_webappNew;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Scneider.Xyphias.TestBase.TestBaseDotNew;

public class LoginPageDotNew extends TestBaseDotNew{
	
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement UserName;
	

	@FindBy(xpath = "//input[@placeholder='Username']//following::input")
	WebElement Password;
	

	@FindBy(xpath="//a[@class='navbar-brand']//img[@class='img-responsive']")
	WebElement Logo;
	

	@FindBy(xpath = "//input[@class='btn btn-small']")
	WebElement Submit;
	
	
	
	
	
	public LoginPageDotNew() {
		
		PageFactory.initElements(driver, this);
	}
    
			
			
	public String VerifyLoginPageDotNewTitle() {
		
	return	driver.getTitle();
	}
	
	
	public boolean VerifyLoginPageDotNewLogo() {
		
		return this.Logo.isDisplayed();
	}
	
	
          public HomePageNewDotNew LoginToHomePageDotNew(String username, String password) {
        	  
        	  this.UserName.sendKeys(username);
        	  
        	  this.Password.sendKeys(password);
        	  
        	  this.Submit.click();
        	  
        	  return new HomePageNewDotNew();
          }

}
