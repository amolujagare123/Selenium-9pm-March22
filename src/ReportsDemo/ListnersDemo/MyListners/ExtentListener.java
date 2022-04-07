package ReportsDemo.ListnersDemo.MyListners;

import TestNGDemo.sites.InitDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static ReportsDemo.ListnersDemo.MyListners.util.ExtentReportInitialization.initExtentReport;
import static ReportsDemo.ListnersDemo.MyListners.util.ExtentReportInitialization.takingScreenshot;

public class ExtentListener extends InitDriver implements ITestListener {

    static ExtentReports extent;
    ExtentTest test;

    public void onTestStart(ITestResult result) {

        System.out.println("onTestStart");

        test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess");

        test.pass(result.getMethod().getMethodName()+":this test is passed");
    }

    public void onTestFailure(ITestResult result) {

        System.out.println("onTestFailure");
        test.info(result.getThrowable());
        test.fail(result.getMethod().getMethodName()+":this test is failed");
        try {
            test.addScreenCaptureFromPath("./myScreenshots/"+takingScreenshot(driver));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult result) {

        System.out.println("onTestSkipped");
        test.info(result.getThrowable());
        test.fail(result.getMethod().getMethodName()+":this test is skipped");
    }

    public void onStart(ITestContext context) {
        System.out.println("onStart");
        if (extent==null)
        {
            extent = initExtentReport();
        }

    }

    public void onFinish(ITestContext context) {
        System.out.println("onFinish");

        extent.flush();
    }
}
