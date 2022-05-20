package StepDefinition;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.P03_currencyChange;

import static StepDefinition.Hooks.driver;

public class D03_currencyChangeStepDef
{
    P03_currencyChange currency = new P03_currencyChange();

    @Given("user navigate to page and change currency")
    public void changeCurrency() throws InterruptedException {

        driver.navigate().to("https://demo.nopcommerce.com/");

        Select currency = new Select(driver.findElement(By.id("customerCurrency")));
        currency.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");

        Thread.sleep(1000);
    }
}
