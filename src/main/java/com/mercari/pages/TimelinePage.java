package com.mercari.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;

public class TimelinePage extends BasePage {
	
	public TimelinePage(WebDriver driver) {
		super(driver);
	}
	
	By myPageLink = By.linkText("MyPage");
	By searchBox = By.xpath("//input[@type='search']");
	By searchBtn = By.xpath("//i[@class='icon-search']");
	By resultItems = By.xpath("//section[@class='items-box']");
	
	
	public void NavigateToMyPage()
	{
		//My assumptions
		ClickElement(myPageLink);
	}
	
	public void searchItemByText(String itemToSearch)
	{
		EnterText(searchBox, itemToSearch);
		ClickElement(searchBtn);
	}
	
	public void clickThirdItem()
	{
		List<WebElement> results = getElements(resultItems);
		ClickElement(results.get(2));
	}
	
}
