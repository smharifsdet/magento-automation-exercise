package stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.*;
import io.cucumber.java.Scenario;
import utilities.Driver;

public class Hooks  {
	@After (order = 2)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
			
		}
	}
    @After (order = 1)
    public void cleanUp() {
    	
    	Driver.closeDriver();
    }
}