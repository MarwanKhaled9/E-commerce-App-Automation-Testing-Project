package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.P08_wishListAdd;

import static StepDefinition.Hooks.driver;

public class D08_wishListAddStepDef {
    P08_wishListAdd wishList = new P08_wishListAdd();

    @When("user add a product to wishlist")
    public void addProduct() throws InterruptedException
    {
        Thread.sleep(500);
        wishList.product("3").click();
    }
    @Then("wishlist notification is displayed")
    public void addProductSuccess() throws InterruptedException
    {
        Assert.assertTrue(driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).isDisplayed());
        Thread.sleep(1000);
    }
}
