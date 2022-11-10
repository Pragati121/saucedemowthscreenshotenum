package test;

import Page.LoginPage;
import org.openqa.selenium.WebDriver;

public class Pagefactory {
    public LoginPage Loginobject;
    WebDriver driver;

    public Pagefactory(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginobject() {
        if (Loginobject == null) {
            Loginobject = new LoginPage(driver);
        }
        return Loginobject;
    }
}
