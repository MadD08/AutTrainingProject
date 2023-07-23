import helpers.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static helpers.ColorPrinter.colorMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IssuesTabTest extends BaseTest {

    @Test
    public void createNewIssueCheck() {
        Logger logger = LogManager.getLogger();
        BasicSteps.logIn();
        BasicSteps.clickOnRepoFromTheList();
        SelectedRepositoryPage selectedRepositoryPage = new SelectedRepositoryPage(driver);
        selectedRepositoryPage.goToIssueTab();
        IssuesTab issuesTab = new IssuesTab(driver);
        colorMessage("Issue tab was opened", logger, Level.INFO);
        issuesTab.clickNewIssueButton();
        colorMessage("Clicked on the button", logger, Level.INFO);
        IssueCreationTab issueCreationTab = new IssueCreationTab(driver);
        assertTrue(issueCreationTab.findTitleInput().isDisplayed());
        colorMessage("Test passed, search field was found", logger, Level.INFO);
    }


    @Test
    public void failedLoginTest() {
        Logger logger = LogManager.getLogger();
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFailed("MadD080", "zFiiXs6j8L3@X6A");
        loginPage.validateErrorMessage("Incorrect username or password.");
        colorMessage("Failed login", logger, Level.INFO);
    }

    @DataProvider(name = "title")
    public Object[] provideTitle() {
        return new Object[] {
                {"First Issue"},
                {"Second Issue"},
                {"Third Issue"}
        };
    }

    @Test(dataProvider = "title")
    public void createNewIssueCheckParam(String title) {
        Logger logger = LogManager.getLogger();
        BasicSteps.logIn();
        BasicSteps.clickOnRepoFromTheList();
        SelectedRepositoryPage selectedRepositoryPage = new SelectedRepositoryPage(driver);
        selectedRepositoryPage.goToIssueTab();
        IssuesTab issuesTab = new IssuesTab(driver);
        colorMessage("Issue tab was opened", logger, Level.INFO);
        issuesTab.clickNewIssueButton();
        colorMessage("Clicked on the button", logger, Level.INFO);
        IssueCreationTab issueCreationTab = new IssueCreationTab(driver);
        assertTrue(issueCreationTab.findTitleInput().isDisplayed());
        colorMessage("Test passed, search field was found", logger, Level.INFO);
        issueCreationTab.enterTitle(title);
    }

}
