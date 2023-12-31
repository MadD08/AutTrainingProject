import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RepositoriesPage extends BasePage {

    private By repoNameLocator = By.xpath("//h3[@class='wb-break-all']");
    private final static String TITLE = "Repo Page";

    public RepositoriesPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public SelectedRepositoryPage goToSpecificRepository() {
        Assertions.assertTrue(driver.findElement(repoNameLocator).isDisplayed());
        driver.findElement(repoNameLocator).click();
        return new SelectedRepositoryPage(driver);
    }
}
