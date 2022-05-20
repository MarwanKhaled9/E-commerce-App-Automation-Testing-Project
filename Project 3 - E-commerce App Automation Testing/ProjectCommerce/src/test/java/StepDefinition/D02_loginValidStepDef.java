package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.P02_login;


import static StepDefinition.Hooks.driver;
import static StepDefinition.Hooks.soft;


public class D02_loginValidStepDef {
    P02_login login = new P02_login();

    @Given("user navigate to login page")
    public void navigate()
    {
        driver.navigate().to( "https://demo.nopcommerce.com/login?returnUrl=%2F");
    }

    @When("user enter a valid username and password")
    public  void enterValidData() throws InterruptedException
    {
        login.idSelector("Email").clear();
        login.idSelector("Email").sendKeys("test1email@gmail.com");
        login.idSelector("Password").clear();
        login.idSelector("Password").sendKeys("StrongP@ssword");
        Thread.sleep(2000);
    }
    @And("user click on login button")
    public void clickLogin()
    {
        login.idSelector("Password").sendKeys(Keys.ENTER);
    }

    @Then("user could login successfully and goto home page")
    public void successLogin() throws InterruptedException
    {
        String expectedResult = "https://demo.nopcommerce.com/";
        String actualResult = driver.getCurrentUrl();
        soft.assertEquals(actualResult.contains(expectedResult), true);

        String expectedMyAccount = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a";
        String actualMyAccount = String.valueOf(driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")));
        soft.assertEquals((actualMyAccount.contains(expectedMyAccount)), true);
        soft.assertAll();
        Thread.sleep(2000);
    }

}
