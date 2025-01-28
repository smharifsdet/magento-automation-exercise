package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverOverToWebelement {
	public static void hoverOverElement(WebDriver driver, WebElement element) {
        try {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
        } catch (Exception e) {
            System.out.println("Error during hover action: " + e.getMessage());
        }
    }
}
