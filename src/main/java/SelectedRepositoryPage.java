import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class SelectedRepositoryPage extends BasePage{
    private By issuesTabLocator = By.xpath("//div[@class='AppHeader-localBar']//descendant::li[@class='d-inline-flex']//a[@class='UnderlineNav-item no-wrap js-responsive-underlinenav-item js-selected-navigation-item']");

    public SelectedRepositoryPage(WebDriver driver) {
        super(driver);
    }

    public WebElement findIssues() {
        webDriverWait.until(elementToBeClickable(driver.findElement(issuesTabLocator)));
        return driver.findElement(issuesTabLocator);
    }

    public IssuesTab goToIssueTab() {
        findIssues().click();
        return new IssuesTab(driver);
    }
}
