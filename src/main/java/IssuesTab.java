import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IssuesTab extends BasePage {

    private By newIssueLocator = By.xpath("//a[@class='btn btn-primary']");


    public IssuesTab(WebDriver driver) {
        super(driver);
    }

    public WebElement findNewIssueButton() {
        Assertions.assertTrue(driver.findElement(newIssueLocator).isDisplayed());
        return driver.findElement(newIssueLocator);
    }

    public IssueCreationTab clickNewIssueButton() {
        findNewIssueButton().click();
        return new IssueCreationTab(driver);
    }

}
