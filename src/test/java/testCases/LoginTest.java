package testCases;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest {
    public String url = "https://practicetestautomation.com/practice-test-login/";
    public String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
    public WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();;
        driver.get(url);
    }

    @Test
    public void testLogin() {
        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);

        login.enterUsername("student");
        login.enterPassword("Password123");
        login.clickSubmit();

        home.getTextCongratulations();
        home.getLogoutBtn();

        Assertions.assertEquals(home.getActualUrl(), expectedUrl);
    }

    @AfterTest
    public void terminateBrowser() {
        driver.quit();
    }
}
