package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    String baseUrl = "https://www.youtube.com/";

    public HomePage goToMain() {
        driver.get(baseUrl);
        return this;
    }
}
