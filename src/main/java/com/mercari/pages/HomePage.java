package com.mercari.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
	
	//Constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}

	//Web Elements
	By loginBtn = By.linkText("Login");
	
	//Reusabe functions
	public void clickLoginBtn()
	{
		ClickElement(loginBtn);
	}
}
