package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import java.util.concurrent.TimeUnit;

public class Hooks {
    //define before and after annotation for your driver
    public static WebDriver driver = null;
    public static SoftAssert soft = new SoftAssert();

    @Before
    public static void openBrowser()
    {
        //1 step
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);

        //2 new object
        driver = new ChromeDriver();

        //3 configure driver
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        //4 Navigate to needed url
        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @After
    public static void closeDriver() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
