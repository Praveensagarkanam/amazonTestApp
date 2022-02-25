import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationPage {

    private WebDriver driver;

    public NavigationPage(WebDriver driver) {
        this.driver = driver;
    }

    private By GoButton = By.xpath("(//input[@type='submit'])[2]");

    private By HighlightedText = By.xpath("(//div[@class='a-row']//span[text()='Televisions'])[2]");
}
