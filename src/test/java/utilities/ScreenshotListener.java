package utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;
import tests.BaseTest;

public class ScreenshotListener extends BaseTest implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        String screenshotPath = TakeScreenShot.captureScreenshot(driver, result.getName());
        test.log(Status.FAIL, result.getThrowable());
        test.addScreenCaptureFromPath(screenshotPath);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test Passed");
    }

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
    }
}
