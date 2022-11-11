package Report;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class Listener implements ITestListener {
    ExtentReports extent = ExtentReport.extentReportGenerator();
    ExtentTest test;
    WebDriver driver;

@Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {

        test.log(Status.PASS, "No Issues encountered!");
    }
    @Override
    public void onTestFailure(ITestResult result) {
        test.fail(result.getThrowable());
    }
    @Override
    public void onTestSkipped(ITestResult result) {
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
    }
}