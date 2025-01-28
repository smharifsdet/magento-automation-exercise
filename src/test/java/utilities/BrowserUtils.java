package utilities;

 

import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

 

 

public class BrowserUtils {

             

              JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

             

              public static WebElement waitForVisibility(WebElement element, int timeout) {

                            

                             WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);

                             return wait.until(ExpectedConditions.visibilityOf(element));

                            

              }

             

              public static WebElement waitForVisibility(By locator, int timeout) {

                            

                             WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);

                             return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

                            

              }


             

              public static WebElement waitForClickability(WebElement element, int timeout) {

                            

                             WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);

                             return wait.until(ExpectedConditions.elementToBeClickable(element));

                            

              }

             

              public static WebElement waitForClickability(By locator, int timeout) {

                            

                             WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);

                             return wait.until(ExpectedConditions.elementToBeClickable(locator));

                            

              }             

              public void scrollUp() {

                             js.executeScript("window.scrollBy(0,350)","");

              }
             

                            

}