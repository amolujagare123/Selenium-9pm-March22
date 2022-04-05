package ScreenshotDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotDemo1 {

    @Test
    public void webpage() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://gmail.com");

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
        FileUtils.copyFile(srcFile,new File("Screenshot\\"+fileName));


    }
}
