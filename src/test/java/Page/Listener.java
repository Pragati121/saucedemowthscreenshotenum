package Page;
import org.testng.ITestListener;
import org.testng.ITestResult;
import test.Baseclass;

import java.io.IOException;

public class Listener extends Baseclass implements ITestListener {

    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
    }


    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
    }

    public void onTestFailure(ITestResult result) {
        try {
            failed(result.getMethod().getMethodName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    }