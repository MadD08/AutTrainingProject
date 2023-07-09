import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectedRepositoryPage extends BasePage {
    private By issuesTabLocator = By.linkText("Issues");

    public SelectedRepositoryPage(WebDriver driver) {
        super(driver);
    }

    public WebElement findIssues() {
        Assertions.assertTrue(driver.findElement(issuesTabLocator).isDisplayed());
        return driver.findElement(issuesTabLocator);
    }

    public IssuesTab goToIssueTab() {
        findIssues().click();
        return new IssuesTab(driver);
    }
}
