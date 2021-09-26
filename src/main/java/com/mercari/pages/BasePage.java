package com.mercari.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends Page {
	public BasePage(WebDriver driver) {
		super(driver);
	}
	
	public void ClickElement(By locator)
	{
		getElement(locator).click();		
	}
	public void ClickElement(WebElement element)
	{
		element.click();		
	}
	
	public void EnterText(By locator, String text)
	{
		getElement(locator).sendKeys(text);
	}
	
	public void SelectLastOption(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> options = select.getOptions();
		
		select.selectByIndex(options.size() -1);
	}
	
	public void SelectOption(By locator, String option) {
		Select select = new Select(getElement(locator));		
		select.selectByVisibleText(option);
	}
	
	public String getText(By locator) {
		return getElement(locator).getText();
	}
	
	public void switchFrame(By locator) {
		driver.switchTo().frame(getElement(locator));
	}
	
	public void switchToNewWindow() {
		String parentWinHandle = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		
		for(String window : windows) {
			if(!window.equals(parentWinHandle))
			{
				driver.switchTo().window(window);
			}
		}
		
	}
	
	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}
	
	public WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	public List<WebElement> getElements(By locator) {
		
		return driver.findElements(locator);
	}
}
