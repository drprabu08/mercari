package com.mercari.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	By email = By.name("email");
	By password = By.name("password");
	By submitBtn = By.xpath("//button[@type='submit']");
	
	public void login(String emailstr, String passwordstr)
	{
		EnterText(email,emailstr);
		EnterText(password, passwordstr);		
		ClickElement(submitBtn);
	}
}
