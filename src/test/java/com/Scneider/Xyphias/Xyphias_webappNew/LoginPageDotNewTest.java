package com.Scneider.Xyphias.Xyphias_webappNew;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Scneider.Xyphias.TestBase.TestBaseDotNew;

public class LoginPageDotNewTest extends TestBaseDotNew{
	
	
	public LoginPageDotNew loginpageobj1;
	
	public HomePageNewDotNew homepageobj1;
	
	
	public LoginPageDotNewTest() {
		
		super();
	}
	
	@BeforeTest
		
	public void InitializeTheLoginPageDotNew() {
		
		//loginpageobj1 = new LoginPageDotNew();
		
		InitializeDotNew();
		
		loginpageobj1 = new LoginPageDotNew();
		
	}
	
	@Test(priority=1)

	
	public void VerifyLoginPageDotNewTitleTest() {
		
		Assert.assertEquals(loginpageobj1.VerifyLoginPageDotNewTitle(), driver.getTitle() , "Wrong Title");
	}
             
	
	@Test(priority=2)
	
	public void VerifyLoginPageDotNewLogocheckTest() {
		
		Assert.assertTrue(loginpageobj1.VerifyLoginPageDotNewLogo(), "Wrong Logo Displayed");
	}
	
	@Test(priority=3)
	
	
	public void VerifyLoginPageToHomePageNewDotNewTest() {
		
		homepageobj1 = new HomePageNewDotNew();
		
		homepageobj1 = loginpageobj1.LoginToHomePageDotNew(propobj1.getProperty("USERNAME"), propobj1.getProperty("PASSWORD"));
	}
	
	
}
