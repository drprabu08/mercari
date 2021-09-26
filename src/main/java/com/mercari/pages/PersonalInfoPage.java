package com.mercari.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalInfoPage extends BasePage {
	public PersonalInfoPage(WebDriver driver) {
		super(driver);
	}
	
	By shippingAddressLink = By.linkText("Shipping Address");
	
	public void NavigateToShippingAddress()
	{
		//My assumptions
		ClickElement(shippingAddressLink);
	}
}
