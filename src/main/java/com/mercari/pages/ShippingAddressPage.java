package com.mercari.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingAddressPage extends BasePage{
	public ShippingAddressPage(WebDriver driver) {
		super(driver);
	}
	
	By addShippingBtn = By.id("addshipping");
	By address1 = By.id("address1");
	By address2 = By.id("address2");
	By city = By.id("city");
	By postcode = By.id("postcode");
	By country = By.id("country");
	By saveBtn = By.xpath("//button[text()='Save']");	
	By successMsg = By.xpath("//label[text()='Success']");
	
	public void ClickAddShippingBtn()
	{	
		ClickElement(addShippingBtn);
	}
	
	public void FillForm(String address1, String address2, String city, String postcode, String country)
	{
		EnterText(this.address1,address1);
		EnterText(this.address2, address2);
		EnterText(this.city, city);
		EnterText(this.postcode, postcode);
		SelectOption(this.country,country);
	}
	
	public void ClickSaveBtn()
	{	
		ClickElement(saveBtn);
	}
	
	public boolean isSuccessMsgDispalyed()
	{
		return getElement(successMsg).isDisplayed();
	}
}
