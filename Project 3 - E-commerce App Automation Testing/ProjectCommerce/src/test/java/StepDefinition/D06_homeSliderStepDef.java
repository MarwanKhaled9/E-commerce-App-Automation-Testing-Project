package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P06_homePage;


import static StepDefinition.Hooks.driver;

public class D06_homeSliderStepDef {
    P06_homePage home = new P06_homePage();

    @When("user click on first slider")
    public void clickOnFirstSlider()
    {
        home.slider("1").click();
    }
    @Then("relative product of the first slider is displayed")
    public void firstProductDisplay() throws InterruptedException
    {
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");
    }

    @When("user click on second slider")
    public void clickOnSecondSlider()
    {
        home.slider("2").click();
    }
    @Then("relative product of the second slider is displayed")
    public void secondProductDisplay() throws InterruptedException
    {
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone_s6");
    }
}
