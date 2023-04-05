package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterStepDefination {
    WebDriver driver;

    @Given("user able to open browser")
    public void user_able_to_open_browser() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Given("enter the Url")
    public void enter_the_url() {
        driver.get("https://demo.nopcommerce.com/");

    }

    @When("user click on Register Link")
    public void user_click_on_register_link() {
        driver.findElement(By.className("ico-register")).click();

    }

    @When("User click on Gender")
    public void user_click_on_gender() {
        driver.findElement(By.id("gender-female")).click();

    }

    @Then("User enter First name")
    public void user_enter_first_name() {
        driver.findElement(By.id("FirstName")).sendKeys("Viraj");

    }

    @Then("User enter Last Name")
    public void user_enter_last_name() {
        driver.findElement(By.id("LastName")).sendKeys("Patel");

    }

    @Then("User enter Date Of Birth")
    public void user_enter_date_of_birth() {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/label"));

    }

    @Then("User enter Valid Email")
    public void user_enter_valid_email() {
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("patelviraj695@gmail.com");

    }

    @Then("User enter company Name")
    public void user_enter_company_name() {
        driver.findElement(By.id("Company")).sendKeys("unify");

    }

    @Then("User enter Password")
    public void user_enter_password() {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[4]/div[2]/div[1]/label")).sendKeys("12345");

    }

    @Then("User Enter Confirm Password")
    public void user_enter_confirm_password() {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[4]/div[2]/div[2]/label")).sendKeys("12345");

    }

    @Then("User is on Complete Register Page")
    public void user_is_on_complete_register_page() {
        driver.findElement(By.id("register-button"));

    }

    @Then("User close The Browser")
    public void user_close_the_browser() {
        driver.close();

    }
}
