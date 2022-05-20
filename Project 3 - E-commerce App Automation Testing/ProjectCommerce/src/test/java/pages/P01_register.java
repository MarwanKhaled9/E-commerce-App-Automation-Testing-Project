package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinition.Hooks.driver;

public class P01_register {
    public WebElement idSelector (String name)
    {
        WebElement element = driver.findElement(By.id(""+name+""));
        return element;
    }
    public WebElement classSelector (String name)
    {
        WebElement element = driver.findElement(By.className(""+name+""));
        return element;
    }
}
