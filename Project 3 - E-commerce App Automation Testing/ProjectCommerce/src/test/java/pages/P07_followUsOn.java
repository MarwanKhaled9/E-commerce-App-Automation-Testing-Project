package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinition.Hooks.driver;

public class P07_followUsOn {
    public WebElement facebook()
    {
        WebElement element = driver.findElement(By.xpath("//*[@href=\"http://www.facebook.com/nopCommerce\"]"));
        return element;
    }
    public WebElement twitter()
    {
        WebElement element = driver.findElement(By.xpath("//*[@href=\"https://twitter.com/nopCommerce\"]"));
        return element;
    }
    public WebElement rss()
    {
        WebElement element = driver.findElement(By.xpath("//*[@href=\"/news/rss/1\"]"));
        return element;
    }
    public WebElement youtube()
    {
        WebElement element = driver.findElement(By.xpath("//*[@href=\"http://www.youtube.com/user/nopCommerce\"]"));
        return element;
    }
}