package test;

import Page.CheckoutdetailsPage;
import Page.LoginPage;
import org.openqa.selenium.WebDriver;

public class Pagefactory {
    public LoginPage Loginobject;
    public CheckoutdetailsPage CheckoutMethod;
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

    public CheckoutdetailsPage getCheckoutMethod() {
        if (CheckoutMethod == null) {
            CheckoutMethod = new CheckoutdetailsPage(driver);
        }
        return CheckoutMethod;
    }
}
