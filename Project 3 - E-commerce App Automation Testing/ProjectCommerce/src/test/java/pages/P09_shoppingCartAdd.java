package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinition.Hooks.driver;

public class P09_shoppingCartAdd {
    public WebElement product(String productNumber)
    {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"button-2 product-box-add-to-cart-button\"])["+productNumber+"]"));
        return element;
    }
}