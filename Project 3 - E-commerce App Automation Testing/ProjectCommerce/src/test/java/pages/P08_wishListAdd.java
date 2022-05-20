package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinition.Hooks.driver;

public class P08_wishListAdd {
    public WebElement product(String productNumber)
    {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"button-2 add-to-wishlist-button\"])["+productNumber+"]"));
        return element;
    }
}
