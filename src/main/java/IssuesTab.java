import helpers.Level;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static helpers.ColorPrinter.colorMessage;

public class IssuesTab extends BasePage {

    private By newIssueLocator = By.xpath("//a[@class='btn btn-primary']");
    private final static String TITLE = "Issue's Tab";


    public IssuesTab(WebDriver driver) {
        super(driver, TITLE);
    }

    public WebElement findNewIssueButton() {
        Assertions.assertTrue(driver.findElement(newIssueLocator).isDisplayed());
        colorMessage("Issue Tab is opened", logger, Level.INFO);
        return driver.findElement(newIssueLocator);
    }

    public IssueCreationTab clickNewIssueButton() {
        findNewIssueButton().click();
        return new IssueCreationTab(driver);
    }

}
