import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectedRepositoryPage extends BasePage {
    private By issuesTabLocator = By.linkText("Issues");
    private final static String TITLE = "Selected Repo Page";

    public SelectedRepositoryPage(WebDriver driver) {
        super(driver, TITLE);
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
