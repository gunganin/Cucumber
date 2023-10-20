package saucedemo.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class add_to_cart {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";
    @Given("User successfully login in Swag Labs web")
    public void user_success_login(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @When("User click button add to cart")
    public void userClickButtonAddToCart() {
    }

    @Then("The products will be add to cart")
    public void theProductsWillBeAddToCart() {
    }
}
