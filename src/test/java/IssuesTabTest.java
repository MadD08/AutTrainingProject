import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class IssuesTabTest extends BaseTest {

    @Test
    public void createNewIssueCheck() {

        BasicSteps.clickOnRepoFromTheList();
        SelectedRepositoryPage selectedRepositoryPage = new SelectedRepositoryPage(driver);
        selectedRepositoryPage.goToIssueTab();
        IssuesTab issuesTab = new IssuesTab(driver);
        issuesTab.clickNewIssueButton();
        IssueCreationTab issueCreationTab = new IssueCreationTab(driver);
        assertTrue(issueCreationTab.findTitleInput().isDisplayed());
    }

}
