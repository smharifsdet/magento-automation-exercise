package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class LogInPage {
	public LogInPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id = "email")
	public WebElement emailFieldLogIn;
	
	@FindBy (id = "pass")
	public WebElement passwordField;
	
	@FindBy (id = "send2")
	public WebElement signInButtonLogIn;
	
	
	
}
