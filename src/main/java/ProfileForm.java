import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfileForm extends BasePage {

    private By yourRepositButtonLocator = By.xpath("//span[contains(text(), \"Your repositories\")]/parent::a");
    private final static String TITLE = "Profile Page";

    public ProfileForm(WebDriver driver) {
        super(driver, TITLE);
    }

    public RepositoriesPage goToRepositoriesPage() {
        Assertions.assertTrue(driver.findElement(yourRepositButtonLocator).isDisplayed());
        driver.findElement(yourRepositButtonLocator).click();
        return new RepositoriesPage(driver);
    }
}
