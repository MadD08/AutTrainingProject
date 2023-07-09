import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class IssuesTabTest extends BaseTest {

    @Test
    public void createNewIssueCheck(){
        BasicSteps.logIn();
        BasicSteps.clickOnRepoFromTheList();
        SelectedRepositoryPage selectedRepositoryPage = new SelectedRepositoryPage(driver);
        selectedRepositoryPage.goToIssueTab();
        IssuesTab issuesTab = new IssuesTab(driver);
        issuesTab.clickNewIssueButton();
        IssueCreationTab issueCreationTab = new IssueCreationTab(driver);
        assertTrue(issueCreationTab.findTitleInput().isDisplayed());
    }

    @Test
    public void test(){
        HomePage home = new HomePage(driver);
        home.goToLoginPage().loginSuccessful("MadD08", "zFiiXs6j8L3@X6A");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToProfileForm().goToRepositoriesPage();
        RepositoriesPage repositoriesPage = new RepositoriesPage(driver);
        repositoriesPage.goToSpecificRepository();
        SelectedRepositoryPage selectedRepositoryPage = new SelectedRepositoryPage(driver);
        selectedRepositoryPage.goToIssueTab();
        IssuesTab issuesTab = new IssuesTab(driver);
        issuesTab.clickNewIssueButton();
    }

}
