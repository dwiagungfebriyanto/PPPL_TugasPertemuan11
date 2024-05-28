package pages;

import object.LoginObject;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    LoginObject login;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.login = new LoginObject(driver);
    }

    public void enterUsername(String username) {
        try {
            inputText(login.getInputUsername(), username);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void enterPassword(String password) {
        try {
            inputText(login.getInputPassword(), password);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickSubmit() {
        try {
            click(login.getSubmitBtn());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
