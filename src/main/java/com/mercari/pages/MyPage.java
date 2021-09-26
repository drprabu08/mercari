package com.mercari.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyPage extends BasePage {
	public MyPage(WebDriver driver) {
		super(driver);
	}
	
	By personalInfoLink = By.linkText("Personal Information");
	
	public void NavigateToPersonalInformation()
	{
		//My assumptions
		ClickElement(personalInfoLink);
	}
}
