package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static StepDefinition.Hooks.driver;

public class D09_shoppingCartAddStepDef {
    @When("user add a product to shopping cart")
    public void addProductToCart() throws InterruptedException
    {
        Thread.sleep(500);
        driver.findElement(By.xpath("(//*[@class=\"button-2 product-box-add-to-cart-button\"])[3]")).click();
    }
    @Then("added to shopping cart notification is displayed")
    public void addProductToCartSuccess() throws InterruptedException
    {
        Assert.assertTrue(driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).isDisplayed());
        Thread.sleep(1000);
    }
}
