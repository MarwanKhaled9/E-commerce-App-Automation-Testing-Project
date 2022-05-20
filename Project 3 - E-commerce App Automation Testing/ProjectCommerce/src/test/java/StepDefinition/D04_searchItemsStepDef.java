package StepDefinition;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.P04_searchItems;


import static StepDefinition.Hooks.driver;
import static StepDefinition.Hooks.soft;

public class D04_searchItemsStepDef
{
    P04_searchItems search = new P04_searchItems();

    @Given("user click on search field and search for an item")
    public void search() throws InterruptedException {
        search.idSelector("small-searchterms").clear();
        search.idSelector("small-searchterms").click();
        search.idSelector("small-searchterms").sendKeys("Apple MacBook Pro 13-inch");
        search.idSelector("small-searchterms").sendKeys(Keys.ENTER);

        Thread.sleep(1000);

        String expectedResult = "nopCommerce demo store. Search";
        String actualResult = driver.getCurrentUrl();
        soft.assertTrue(expectedResult.contains(actualResult));

        int resultSize = driver.findElements(By.className("search-results")).size();
        soft.assertTrue(resultSize > 0);
    }
}
