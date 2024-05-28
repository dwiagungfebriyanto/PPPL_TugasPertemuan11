package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeObject {
    WebDriver driver;

    public HomeObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getTextCongratulations() {
        return By.xpath("//*[contains(text(), 'Congratulations')]");
    }

    public By getLogoutBtn() {
        return By.xpath("//*[contains(text(), 'Log out')]");
    }
}
