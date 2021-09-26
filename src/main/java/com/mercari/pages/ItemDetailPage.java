package com.mercari.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemDetailPage extends BasePage {
	public ItemDetailPage(WebDriver driver) {
		super(driver);
	}
	
	By itemTitle = By.xpath("//h1[@class='item-name']");
	
	public String getItemTitle()
	{
		return getText(itemTitle);
	}
}
