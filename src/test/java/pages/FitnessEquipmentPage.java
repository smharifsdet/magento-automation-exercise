package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class FitnessEquipmentPage {
	public FitnessEquipmentPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[4]/div/div/strong/a")
	public WebElement spriteFoamRoller;
	
	@FindBy (xpath = "//*[@id=\"product-addtocart-button\"]")
	public WebElement addToCartInspriteFoamRoller;
	
	@FindBy (xpath = "/html/body/div[2]/header/div[2]/div[1]/a")
	public WebElement updatedCartQuantityElement;
	
	@FindBy (xpath = "//*[@id=\"top-cart-btn-checkout\"]")
	public WebElement proceedToCheckout;
	
}
