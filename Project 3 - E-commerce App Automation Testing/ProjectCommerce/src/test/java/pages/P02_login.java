package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinition.Hooks.driver;

public class P02_login {
    public WebElement idSelector(String name)
    {
        WebElement element = driver.findElement(By.id(""+name+""));
        return element;
    }
}
