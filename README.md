# MagentoAutomationFramework
### Test Development Set up

This project is a **Selenium WebDriver** automation framework using **Java**, **Cucumber**, **JUnit**, and **Maven** as a build tool. The project is set up to run automated tests on web applications using the **Page Object Model (POM)** and is managed with **Maven** for dependency management.

## Prerequisites

Before getting started, ensure you have the following installed:

- **Java JDK 8+**: Download and install from [Oracle](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html).
- **Eclipse IDE**: Download and install from [Eclipse Official Site](https://www.eclipse.org/downloads/).
- **Maven**: Download and install from [Apache Maven](https://maven.apache.org/download.cgi).
- **WebDriver** (Chrome, Firefox, etc.): You can download the necessary driver from the following locations:
  - [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/)
  - [GeckoDriver (Firefox)](https://github.com/mozilla/geckodriver/releases)
  
## Getting Started

To get started with the project, follow the steps below:

### 1. Clone the Repository

Clone the repository to your local machine:

```bash
git clone (url for the repository)

$ mvn -version

$ java -version
```

> Make sure to Set up JAVA_HOME as user variables```$ JAVA_HOME="Path\to\Java\jdk11"

### 2. Import the Project into Eclipse IDE

1. Open Eclipse IDE.
2. Go to `File` -> `Import`.
3. Select `Existing Maven Projects` under `Maven`.
4. Click `Next` and browse to the directory where you cloned the project.
5. Select the `pom.xml` file and click `Finish`.

### 3. Install Required Dependencies

This project uses Maven for dependency management. Maven will automatically download all necessary dependencies when you run the project. If you are using Eclipse, you can right-click the project and select **Maven > Update Project**.

>If new dependencies are being added make sure to update the project to make it works.

### 4. Configure WebDriver

Ensure that the appropriate WebDriver for your chosen browser is downloaded and added to your system’s PATH. Alternatively, you can specify the path directly in your test configuration.

### 5. Running Tests

#### From Eclipse:

1. Right-click on the `Run` folder or specific test class.
2. Select **Run As > JUnit Test** to run the tests with JUnit.

#### From Command Line:

To run the tests via Maven, navigate to the project root directory in your terminal and execute:

```bash
mvn clean test
```

### 6. Reports

Once tests have run successfully, the results will be generated in the `target` folder in the project directory. Cucumber test reports can be found in the `target/cucumber-reports` directory, including the `cucumber.html` and `cucumber.json` files.

## Project Structure

The project is organized as follows:

```
selenium-java-cucumber-junit-maven/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── stepdefs/
│   │           └── StepDefinitions.java     # Cucumber step definitions
│   │
│   └── test/
│       └── java/
│           └── features/
│               └── login.feature           # Cucumber feature files
│
├── pom.xml                                  # Maven build file
└── target/                                  # Compiled and test reports
```

### Key Directories:

- **src/test/java/features**: Contains your Cucumber feature files that define test scenarios using Gherkin syntax.
- **src/test/java/stepdefs**: Contains the Java classes that implement step definitions for the feature files.
- **target**: Contains the compiled `.class` files, test reports, and other artifacts generated during the test execution.

### Key Files:

- **pom.xml**: The Maven build file that handles dependencies (including Selenium, Cucumber, and JUnit).
- **StepDefinitions.java**: Java classes that contain step definitions for the scenarios in your feature files.
- **.feature**: A sample Cucumber feature file written in Gherkin syntax.

## Example Cucumber Feature File

```gherkin
Feature: Login functionality

  Scenario: Valid user login
    Given I am on the login page
    When I enter valid credentials
    Then I should be redirected to the homepage
```

## Example Step Definitions (StepDefinitions.java)

```java
package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {

    WebDriver driver;

    @Given("^I am on the login page$")
    public void i_am_on_the_login_page() {
        driver = new ChromeDriver();
        driver.get("https://www.example.com/login");
    }

    @When("^I enter valid credentials$")
    public void i_enter_valid_credentials() {
        driver.findElement(By.id("username")).sendKeys("validUser");
        driver.findElement(By.id("password")).sendKeys("validPassword");
        driver.findElement(By.id("loginButton")).click();
    }

    @Then("^I should be redirected to the homepage$")
    public void i_should_be_redirected_to_the_homepage() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://www.example.com/home", currentUrl);
        driver.quit();
    }
}
```

## Maven Dependencies (pom.xml)

```xml
<dependencies>
    <!-- Selenium WebDriver -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.141.59</version>
    </dependency>

    <!-- Cucumber dependencies -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>7.1.0</version>
    </dependency>
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-JUnit</artifactId>
        <version>7.1.0</version>
    </dependency>

    <!-- JUnit for test execution -->
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.11</version>
        <scope>test</scope>
    </dependency>

    <!-- Maven Surefire Plugin for running tests -->
    <dependency>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>2.22.1</version>
    </dependency>

</dependencies>
```

## Conclusion

This project provides a simple yet powerful automation framework using **Selenium**, **Java**, **Cucumber**, **JUnit**, and **Maven**. It leverages the strengths of **Cucumber** for behavior-driven development and integrates with **JUnit** for efficient test execution. 

Feel free to customize the feature files, step definitions, and other configurations to suit your test automation needs.

---
 