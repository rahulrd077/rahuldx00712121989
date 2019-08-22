package com.Scneider.Xyphias.Xyphias_webappNew;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Scneider.Xyphias.TestBase.TestBaseDotNew;
import com.Scneider.Xyphias.testUtil.UtilDotNew;

public class ContactsPageDotNewTest extends TestBaseDotNew{
	
	public static String SheetName = "HelloSheet";
	
public LoginPageDotNew loginpageobj3;
	
	public HomePageNewDotNew homepageobj3;
	
	public ContactsPageDotNew contactspageobj2;
	
	public UtilDotNew utilobj2;
	
	
	public ContactsPageDotNewTest() {
		
		super();
	}
	
	
	
	@BeforeTest
	public void InitializeContactsPage() {
		
		InitializeDotNew();
		
		loginpageobj3 = new LoginPageDotNew();
		
		homepageobj3 = new HomePageNewDotNew();
		
		homepageobj3 = loginpageobj3.LoginToHomePageDotNew(propobj1.getProperty("USERNAME"), propobj1.getProperty("PASSWORD"));
		
		
		utilobj2 = new UtilDotNew();
		
		contactspageobj2 = new ContactsPageDotNew();
		
		utilobj2.SwitchFramesAgain();
		contactspageobj2 = homepageobj3.ClickonContactsLinkFromHomePage();
	}
	
	@Test(priority=1)
	
	
	public void VerifyContactsPageDotNewTitle() {
		
		Assert.assertEquals(contactspageobj2.VerifyContactsPageTitle(), driver.getTitle() , "Wrong ContactsPage title");
	}
	
	@DataProvider
	
	public Object[][] getcontactdetailsfromExcel(){
		
		Object[] [] details = utilobj2.getDatadetails(SheetName);
		
		return details;
	}
	
	
	@Test(dataProvider = "getcontactdetailsfromExcel" ,priority=2)
	
	public void EnterContactsDetailsTest(String Titles, String firstname , String middlenames , String lastnames, String company) {
		
		homepageobj3.ClickonNewContactsLinkFromHomePage();
		
		contactspageobj2.EnterTheContactDetails(Titles, firstname, middlenames, lastnames, company);
	         
		
	}

}
