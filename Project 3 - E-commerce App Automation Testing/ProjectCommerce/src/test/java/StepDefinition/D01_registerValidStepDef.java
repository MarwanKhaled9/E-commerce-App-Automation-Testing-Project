package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.P01_register;


import static StepDefinition.Hooks.driver;
import static StepDefinition.Hooks.soft;

public class D01_registerValidStepDef
{
    P01_register register = new P01_register();

    @Given("user navigate to register tab")
    public void gotoRegisterTab()
    {
        driver.findElement(By.className("ico-register")).click();
    }
    @When("user fill his Personal Details")
    public void fillPersonalDetails() throws InterruptedException {

        register.idSelector("gender-male").click();
        register.idSelector("FirstName").clear();
        register.idSelector("FirstName").sendKeys("Marwan");

        register.idSelector("LastName").clear();
        register.idSelector("LastName").sendKeys("Khaled");

        Thread.sleep(500);

        Select birthDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
        birthDay.selectByValue("21");
        Select birthMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        birthMonth.selectByValue("1");
        Select birthYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
        birthYear.selectByValue("1998");

        register.idSelector("Email").sendKeys("test1email@gmail.com");
    }
    @And("fill company name")
    public void fillCompanyName()
    {
        driver.findElement(By.id("Company")).sendKeys("Automation Company");
    }
    @And("fill password fields")
    public void fillPassword()
    {
        register.idSelector("Password").sendKeys("StrongP@ssword");
        register.idSelector("ConfirmPassword").sendKeys("StrongP@ssword");
    }
    @And("user click on register button")
    public void clickRegister()
    {
        driver.findElement(By.id("register-button")).click();
    }
    @Then("user could register successfully and goto home page")
    public void successRegister() throws InterruptedException {
        String expectedResult = "Your registration completed";
        String expectedColor = "rgba(76, 177, 124, 1)";

        String actualResult = register.classSelector("result").getText();
        String actualColor = register.classSelector("result").getCssValue("color");

        soft.assertTrue(actualResult.contains(expectedResult), "Error Message: Wrong text");
        soft.assertTrue(actualColor.contains(expectedColor),"Error Message: Wrong color");
        soft.assertAll();
        Thread.sleep(500);
    }
}
