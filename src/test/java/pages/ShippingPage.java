package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class ShippingPage {
	public ShippingPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy (xpath = "//*[@id=\"opc-sidebar\"]/div[1]/div/div[1]/strong")
	public WebElement itemInCart;
	
	@FindBy (xpath = "//*[@id=\"opc-sidebar\"]/div[1]/div/div[2]/div/ol/li/div/div/div/div[1]/strong")
	public WebElement spriteFoamRoller;	
	
}
