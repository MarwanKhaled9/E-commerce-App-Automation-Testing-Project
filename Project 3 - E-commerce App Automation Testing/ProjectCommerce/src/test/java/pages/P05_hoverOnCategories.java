package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinition.Hooks.driver;

public class P05_hoverOnCategories
{
    public WebElement electronics()
    {
        WebElement element = driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/electronics\"]"));
        return element;
    }
    public WebElement cellPhones()
    {
        WebElement element = driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/cell-phones\"]"));
        return element;
    }

}