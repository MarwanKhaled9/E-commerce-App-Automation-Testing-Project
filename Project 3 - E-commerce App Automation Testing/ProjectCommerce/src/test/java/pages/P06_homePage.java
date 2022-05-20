package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinition.Hooks.driver;

public class P06_homePage {
    public WebElement slider(String sliderNumber)
    {
        WebElement element = driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])["+sliderNumber+"]"));
        return element;
    }
}
