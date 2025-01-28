package stepdefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FitnessEquipmentPage;
import pages.HomePage;
import pages.LogInPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.HoverOverToWebelement;

public class AddToCartStepdefinition {
	
	HomePage hp = new HomePage();
	LogInPage lp = new LogInPage();
	FitnessEquipmentPage fep = new FitnessEquipmentPage();
	@Given("user is able to logged in with a valid credentials and the product is in stock")
	public void user_is_able_to_logged_in_with_a_valid_credentials_and_the_product_is_in_stock() {
		Driver.getDriver().get(ConfigReader.getProperty("url"));
		hp.signInButton.click();
		lp.emailFieldLogIn.sendKeys(ConfigReader.getProperty("userEmail"));
		lp.passwordField.sendKeys(ConfigReader.getProperty("password"));
		lp.signInButtonLogIn.click();
		HoverOverToWebelement.hoverOverElement(Driver.getDriver(), hp.gearTab);
		BrowserUtils.waitForVisibility(hp.fitnessEquipment, 3);
		hp.fitnessEquipment.click();
		HoverOverToWebelement.hoverOverElement(Driver.getDriver(), fep.spriteFoamRoller);
		fep.spriteFoamRoller.click();
		
	}
	
	@When("user clicks on add to cart button for the product")
	public void user_clicks_on_add_to_cart_button_for_the_product() throws InterruptedException {
		BrowserUtils.waitForClickability(fep.addToCartInspriteFoamRoller, 3);
		fep.addToCartInspriteFoamRoller.click();
		Thread.sleep(3000);
		
	}

	@Then("user should be able to add the product in to the cart successfully")
	public void user_should_be_able_to_add_the_product_in_to_the_cart_successfully() {
		String cartValue = fep.updatedCartQuantityElement.getText();
		System.out.println(cartValue);
		Assert.assertNotNull(cartValue);
        
	}           
}