import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class IssuesTab extends BasePage{

    By newIssueLocator = By.xpath("//a[@class='btn btn-primary']");


    public IssuesTab(WebDriver driver) {
        super(driver);
    }

    public WebElement findNewIssueButton() {
        webDriverWait.until(elementToBeClickable(driver.findElement(newIssueLocator)));
        return driver.findElement(newIssueLocator);
    }

    public IssueCreationTab clickNewIssueButton() {
        findNewIssueButton().click();
        return new IssueCreationTab(driver);
    }

}
