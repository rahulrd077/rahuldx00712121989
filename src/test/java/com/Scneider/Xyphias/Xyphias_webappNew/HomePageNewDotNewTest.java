package com.Scneider.Xyphias.Xyphias_webappNew;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Scneider.Xyphias.TestBase.TestBaseDotNew;
import com.Scneider.Xyphias.testUtil.UtilDotNew;

public class HomePageNewDotNewTest extends TestBaseDotNew{
	
	public LoginPageDotNew loginpageobj2;
	
	public HomePageNewDotNew homepageobj2;
	
	public ContactsPageDotNew contactspageobj1;
	
	public UtilDotNew utilobj1;
	
	
	public HomePageNewDotNewTest() {
		
		super();
	}
	
	@BeforeTest
	
	public void InitializeHomePageDotNew() {
		
		InitializeDotNew();
		
		loginpageobj2 = new LoginPageDotNew();
		
		homepageobj2  = new HomePageNewDotNew();
		
		homepageobj2 = loginpageobj2.LoginToHomePageDotNew(propobj1.getProperty("USERNAME"), propobj1.getProperty("PASSWORD"));
		
		
		
		utilobj1 = new UtilDotNew();
		
		contactspageobj1 = new ContactsPageDotNew();
		
	}
  
	         @Test(priority=1)
	         
	         public void VerifyHomePageNewDotNewTitleTest() {
	        	 
	        	Assert.assertEquals( homepageobj2.VerifyHomePageNewDotNewTitle() ,driver.getTitle() , "Please verify the wrong title");
	        	 
	         }
	
	         @Test(priority=2)
	         
	         
	         public void VerifyHomePageNewDotNewUserLabelTest() {
	        	 
	        	 utilobj1.SwitchFramesAgain();
	        	 
	        	Assert.assertTrue(homepageobj2.VerifyHomePageNewDotNewUserLabel(), "Wrong UserLabel");
	         }
	
	         @Test(priority=3)
	         
	         public void ClickOnContactsLinkFromHomePageTest() {
	        	 
	        	 //utilobj1.SwitchFramesAgain();
	        	 
	        	 contactspageobj1 = homepageobj2.ClickonContactsLinkFromHomePage();
	         }
	         
	         @Test(priority=4)
	         
	         
	         public void ClickOnNEWContactsLinkFromHomePageTest() {
	        	 //utilobj1.SwitchFramesAgain();
	        	 
	        	 homepageobj2.ClickonNewContactsLinkFromHomePage();
	        	 
	         }
}
