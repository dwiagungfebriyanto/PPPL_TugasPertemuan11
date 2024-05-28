package pages;

import object.HomeObject;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    HomeObject home;

    public HomePage(WebDriver driver) {
        super(driver);
        this.home = new HomeObject(driver);
    }

    public void getTextCongratulations() {
        try {
            verifyElementVisible(home.getTextCongratulations());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void getLogoutBtn() {
        try {
            verifyElementVisible(home.getLogoutBtn());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getActualUrl() {
        return driver.getCurrentUrl();
    }
}
