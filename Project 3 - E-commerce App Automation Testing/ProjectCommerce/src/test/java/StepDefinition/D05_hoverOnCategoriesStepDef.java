package StepDefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P05_hoverOnCategories;

import static StepDefinition.Hooks.driver;

public class D05_hoverOnCategoriesStepDef {
    P05_hoverOnCategories hover = new P05_hoverOnCategories();

    @When("user hover category and select subcategory")
    public void user_hover_category() throws InterruptedException {

        Actions action = new Actions(driver);
        // hover on electronics
        WebElement electronics = hover.electronics();
        action.moveToElement(electronics).perform();
        Thread.sleep(1000);

        // hover on cell phone
        WebElement cellPhones = hover.cellPhones();

        String actualResult = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[2]/a")).getText().toLowerCase();

        System.out.println(actualResult);
        String expectedResult = "cell phones";
        Assert.assertTrue(expectedResult.contains(actualResult));

        // click on cell phone
        cellPhones.click();
        Thread.sleep(2000);
    }
}
