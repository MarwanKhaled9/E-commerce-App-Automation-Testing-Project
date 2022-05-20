package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import pages.P07_followUsOn;

import java.util.ArrayList;

import static StepDefinition.Hooks.driver;

public class D07_followUsOnStepDef {
    P07_followUsOn followUs = new P07_followUsOn();

    @When("user click on facebook link")
    public void clickFaceBook() throws InterruptedException
    {
        Thread.sleep(500);
        followUs.facebook().click();
        Thread.sleep(1000);
    }
    @Then("facebook page opens in a new tab")
    public void facebookOpens() throws InterruptedException {
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        Assert.assertEquals("https://www.facebook.com/nopCommerce",driver.getCurrentUrl());
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(Tabs.get(0));

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }
    @When("user click on twitter link")
    public void clickTwitter() throws InterruptedException
    {
        Thread.sleep(500);
        followUs.twitter().click();
        Thread.sleep(1000);
    }
    @Then("twitter page opens in a new tab")
    public void twitterOpens() throws InterruptedException {
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        Assert.assertEquals("https://twitter.com/nopCommerce",driver.getCurrentUrl());
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(Tabs.get(0));

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }

    @When("user click on rss link")
    public void clickRss() throws InterruptedException
    {
        Thread.sleep(500);
        followUs.rss().click();
        Thread.sleep(1000);
    }
    @Then("rss page opens in a new tab")
    public void rssOpens() throws InterruptedException {
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        Assert.assertEquals("https://demo.nopcommerce.com/new-online-store-is-open",driver.getCurrentUrl());
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(Tabs.get(0));

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }

    @When("user click on youtube link")
    public void clickYoutube() throws InterruptedException
    {
        Thread.sleep(500);
        followUs.youtube().click();
        Thread.sleep(1000);
    }
    @Then("youtube page opens in a new tab")
    public void youtubeOpens() throws InterruptedException {
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        Assert.assertEquals("https://www.youtube.com/user/nopCommerce",driver.getCurrentUrl());
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(Tabs.get(0));

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }
}
