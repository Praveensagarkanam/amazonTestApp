import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchAmazonApp {
    WebDriver driver;

    @BeforeTest
    public void launchAmazon(){
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
    @Test
    public void test_Navigation() throws InterruptedException {
        HomePage home = new HomePage(driver);
        ResultsPage resultsPage = new ResultsPage(driver);
        NavigationPage navigationPage = new NavigationPage(driver);
        home.clickAllMenu();
        home.navigateToLink("TV, Appliances, Electronics");
        home.navigateToLink("Televisions");
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }
}