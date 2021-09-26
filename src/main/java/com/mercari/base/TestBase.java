package com.mercari.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mercari.util.Constants;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public TestBase()
	{
		try {
			prop = new Properties();
			FileInputStream stream = new FileInputStream(Constants.CONFIG_PATH);
			prop.load(stream);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
}
