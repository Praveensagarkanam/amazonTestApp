import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private By AllLinks = By.xpath("//a[@id='nav-hamburger-menu']");

    private By GoButton = By.xpath("(//input[@type='submit'])[2]");

    private By HighlightedText = By.xpath("(//div[@class='a-row']//span[text()='Televisions'])[2]");
    public void SelectBrand(String brand){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Brand(brand)));
        driver.findElement(Brand(brand));
    }
}
