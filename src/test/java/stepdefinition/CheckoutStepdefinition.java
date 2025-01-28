package stepdefinition;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FitnessEquipmentPage;
import pages.ShippingPage;
import utilities.BrowserUtils;

public class CheckoutStepdefinition {
	
	FitnessEquipmentPage fep = new FitnessEquipmentPage();
	ShippingPage sp= new ShippingPage();
	
	@When("after adding the product in to the card and proceed to the checkout")
	public void after_adding_the_product_in_to_the_card_and_proceed_to_the_checkout() {
	   fep.updatedCartQuantityElement.click();
	   BrowserUtils.waitForClickability(fep.proceedToCheckout, 3);
	   fep.proceedToCheckout.click();
	}

	@Then("the checkout page should displayed the correct product to the users")
	public void the_checkout_page_should_displayed_the_correct_product_to_the_users() {
	   BrowserUtils.waitForVisibility(sp.itemInCart, 3);
	   sp.itemInCart.click();
	   BrowserUtils.waitForVisibility(sp.spriteFoamRoller, 3);
       Assert.assertTrue(sp.spriteFoamRoller.isDisplayed());
	}


	
             
}