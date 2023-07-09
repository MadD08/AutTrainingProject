import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class BasicSteps extends BaseTest {


    public static void logIn() {
        HomePage home = new HomePage(driver);
        home.goToLoginPage().loginSuccessful("MadD08", "zFiiXs6j8L3@X6A");
    }

    public static void clickOnRepoFromTheList() {
        MainPage mainPage = new MainPage(driver);
        mainPage.goToProfileForm().goToRepositoriesPage();
        RepositoriesPage repositoriesPage = new RepositoriesPage(driver);
        repositoriesPage.goToSpecificRepository();
    }

}
