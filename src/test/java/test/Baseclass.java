package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Baseclass {
  static WebDriver driver;
    public Pagefactory pageFactory;

    public void Setup() throws IOException {
        FileReader reader = new FileReader("src/test/java/TestData/Resource.Properties");
        Properties data = new Properties();
        data.load(reader);
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.get(data.getProperty("URL"));
        takeScreenshot("saucedemo_homepage");
        driver.manage().window().maximize();
        pageFactory = new Pagefactory(driver);
    }

  protected  void takeScreenshot(String Screenshot) throws IOException {
      //take screenshot and store it as a file format
     File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     //copy the file and stor it in desired location
      FileUtils.copyFile(file,new File("C:\\Users\\PragatiSharma\\IdeaProjects\\Saucedemo11nov\\src\\test\\java\\test"+Screenshot+".jpg"));
  }
//    @AfterClass
//    public void close() {
//        driver.quit();
//    }

}

