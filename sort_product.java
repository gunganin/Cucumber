package saucedemo.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class sort_product {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";
    @Given("User successfully login in Swag Labs web")
    public void user_sort_product(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(baseUrl);

    }

    @When("User in dashboard page")
    public void userInDashboardPage() {
    }

    @And("User click select button sort product in the top right")
    public void userClickSelectButtonSortProductInTheTopRight() {
    }

    @Then("The products will be sorted by name from Z to A")
    public void theProductsWillBeSortedByNameFromZToA() {
    }

    @Then("The products can not be sorted by name from Z to A")
    public void theProductsCanNotBeSortedByNameFromZToA() {
    }
}
