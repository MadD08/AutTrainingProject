import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class IssueCreationTab extends BasePage{

    By titleInputLocator = By.xpath("//input[@class='form-control required title js-session-resumable js-quick-submit input-lg input-block input-contrast']");

    public IssueCreationTab(WebDriver driver) {
        super(driver);
    }

    public WebElement findTitleInput() {
        return driver.findElement(titleInputLocator);
    }
}
