import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IssueCreationTab extends BasePage {

    private By titleInputLocator = By.xpath("//input[@class='form-control required title js-session-resumable js-quick-submit input-lg input-block input-contrast']");
    private final static String TITLE = "Issue Creation Page";

    public IssueCreationTab(WebDriver driver) {
        super(driver,TITLE);
    }

    public WebElement findTitleInput() {
        return driver.findElement(titleInputLocator);
    }
}
