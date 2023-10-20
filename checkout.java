package saucedemo.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class checkout {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";
    @Given("User on the Checkout: Your Information Page")
    public void user_checkout_product(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Given("User on the Your Information Page")
    public void userOnTheYourInformationPage() {
    }

    @When("User click button checkout in Your Cart page")
    public void userClickButtonCheckoutInYourCartPage() {
    }

    @Then("User redirect to Your Information page")
    public void userRedirectToYourInformationPage() {
    }

    @And("User input First Name")
    public void userInputFirstName() {
    }

    @And("User input Last Name")
    public void userInputLastName() {
    }

    @And("User input ZIP or Postal Code")
    public void userInputZIPOrPostalCode() {
    }

    @And("User click button Continue")
    public void userClickButtonContinue() {
    }

    @Then("User successfully checkout and redirect to Checkout Overview page")
    public void userSuccessfullyCheckoutAndRedirectToCheckoutOverviewPage() {
    }

    @And("User click button Finish")
    public void userClickButtonFinish() {
    }

    @Then("User redirect to Checkout Complete page")
    public void userRedirectToCheckoutCompletePage() {
    }

    @And("User does not input Last Name")
    public void userDoesNotInputLastName() {
    }

    @And("User can't checkout and appear message error")
    public void userCanTCheckoutAndAppearMessageError() {
    }
}
