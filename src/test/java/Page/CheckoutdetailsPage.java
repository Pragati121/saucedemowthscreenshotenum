package Page;
import Enum.LoginEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.Baseclass;

import java.io.IOException;
import java.time.Duration;

public class CheckoutdetailsPage extends Baseclass {
    static WebDriver driver;
    WebDriverWait wait;
    String UsernameAndPassword = "//input[@name='%s']";
    By clickOnAddTocartButton=By.xpath("//a[@class='shopping_cart_link']");
    By Clickoncheckout = By.xpath("//button[@name='checkou']");

    public CheckoutdetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void Checkoutdetail() throws IOException {
        driver.findElement(By.xpath(String.format(UsernameAndPassword, LoginEnum.Username.getResourcesName()))).sendKeys("standard_user");
        driver.findElement(By.xpath(String.format(UsernameAndPassword, LoginEnum.Password.getResourcesName()))).sendKeys("secret_sauce");
        driver.findElement(By.xpath(String.format(UsernameAndPassword, LoginEnum.Login.getResourcesName()))).click();
        driver.findElement(clickOnAddTocartButton).click();
        driver.findElement(Clickoncheckout).click();
    }
}
