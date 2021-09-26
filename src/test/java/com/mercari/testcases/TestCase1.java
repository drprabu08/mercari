package com.mercari.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mercari.pages.*;

public class TestCase1 extends BaseTest{
	@Test
	public void Scenario1()
	{
		page.getInstance(HomePage.class).clickLoginBtn();
		
		LoginPage loginpage = page.getInstance(LoginPage.class);
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		loginpage.login(username, password);
		
		//My assumption is to navigate to MyPage
		page.getInstance(TimelinePage.class).NavigateToMyPage();
		
		//Navigate to Personal Info
		page.getInstance(MyPage.class).NavigateToPersonalInformation();		
		
		//Navigate to Shipping Address
		page.getInstance(PersonalInfoPage.class).NavigateToShippingAddress();
		
		//Click Add Shipping
		ShippingAddressPage addresspage = page.getInstance(ShippingAddressPage.class);
		addresspage.ClickAddShippingBtn();
		
		//Fill Form and save
		addresspage.FillForm("address line 1", "address line 2", "Chennai", "600116", "India");
		addresspage.ClickSaveBtn();
		
		//Verify Success message is displayed
		Assert.assertTrue(addresspage.isSuccessMsgDispalyed());
	}
	
	@Test
	public void Scenario2()
	{
		//Search for an Item in Timeline page
		TimelinePage timeline = page.getInstance(TimelinePage.class);
		timeline.searchItemByText("Macbook");
		
		//Click the 3rd item from the results
		timeline.clickThirdItem();
		
		//get the title of that item
		String title = page.getInstance(ItemDetailPage.class).getItemTitle();
		
		//Verify the title contains word 'macbook'
		Assert.assertTrue(title.contains("macbook"));
	}
}