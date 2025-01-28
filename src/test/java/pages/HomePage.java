package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "(//a[contains(@href, 'https://magento.softwaretestingboard.com/customer/account/login/referer')])[1]")
	public WebElement signInButton;
	
	@FindBy (id = "search")
	public WebElement searchField;
	
	@FindBy (xpath = "//span [.=\"Gear\"]")
	public WebElement gearTab;
	
	@FindBy (xpath = "//span [. =\"Sale\"]")
	public WebElement saleTab;
	
	@FindBy (xpath = "(//span[.=\"Fitness Equipment\"])[1]")
	public WebElement fitnessEquipment;
	
	@FindBy (xpath = "//a[@data-testid ='open-registration-form-button']")
	public WebElement addToCartButton;
	
}
