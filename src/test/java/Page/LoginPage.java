package Page;
import Enum.LoginEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.Baseclass;
import java.io.IOException;
import java.time.Duration;
public class LoginPage extends Baseclass {
   static WebDriver driver;
   WebDriverWait wait;
    String UsernameAndPassword = "//input[@name='%s']";
    String OpenAndCloseSieBar ="//button[@id='react-burger-menu-btn']";
    By Aboutpage =By.xpath("(//a[contains(@class,'menu-item')])[2]");
    By addItemToCart =By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']");
    By clickOnAddTocartButton=By.xpath("//a[@class='shopping_cart_link']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void USerMethod() throws IOException {
        driver.findElement(By.xpath(String.format(UsernameAndPassword, LoginEnum.Username.getResourcesName()))).sendKeys("standard_user");
        driver.findElement(By.xpath(String.format(UsernameAndPassword, LoginEnum.Password.getResourcesName()))).sendKeys("secret_sauce");
        driver.findElement(By.xpath(String.format(UsernameAndPassword, LoginEnum.Login.getResourcesName()))).click();
        driver.findElement(By.xpath(String.format(OpenAndCloseSieBar, LoginEnum.OpenSidebar.getResourcesName()))).click();
       wait.until(ExpectedConditions.visibilityOfElementLocated(Aboutpage));
        driver.findElement(Aboutpage).click();
        driver.navigate().back();
        driver.navigate().refresh();
        driver.findElement(addItemToCart).click();
        driver.findElement(clickOnAddTocartButton).click();
        takeScreenshot("Cart_Page");

    }
}

