package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {
    @Test
    public void openMainPage() {
        HomePage homePage = new HomePage(driver);

        homePage.goToMain();
    }
}
