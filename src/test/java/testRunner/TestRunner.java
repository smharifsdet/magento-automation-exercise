package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features", 
            glue ="stepdefinition",
            tags ="@SmokeTest or @RegressionTest",
            plugin = {"pretty", "html:target/cucumber-reports.html"},
            monochrome = true,
            dryRun = false

)
public class TestRunner {
 
}
