package ReportsDemo.ListnersDemo.MyListners.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportInitialization {


    public static ExtentReports initExtentReport()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports1/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setReportName("Regression Tests");
        reporter.config().setDocumentTitle("Stock Management system");

        extent.setSystemInfo("Developers Name","Anand");
        extent.setSystemInfo("Testers Name","Shobit");
        extent.setSystemInfo("Client","Infosys");
        extent.setSystemInfo("Project End Date","22/06/2022");

        return extent;
    }

    public static  String takingScreenshot(WebDriver driver) throws IOException {
        // 1. create an object reference of TakesScreenshot (interface)
        // assign the current driver to it --> typecast it to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. using ts (object reference of TakesScreenShot ) call the method
        // getScreenshotAs() --> this will give us the screenshot in object/file format
        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        // Generate the filename
        String timeStamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";

        // 3. copy this file object into a new real image file
        // FileUtils.copyFile(srcFile,new File("D:\\screenshots\\Img.png"));
        FileUtils.copyFile(srcFile,new File("Reports1\\myScreenshots\\"+fileName));

        return fileName;

    }
}
