package DataDProviderDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginDemoExcel {

    @Test (dataProvider = "getData")
    public void loginTest(String username,String password)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUser.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys(password);

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();

    }

    @DataProvider
    public Object[][] getData() throws IOException {

        FileInputStream fis = new FileInputStream("Data/MyData.xls");
        HSSFWorkbook workbook = new HSSFWorkbook(fis);
        HSSFSheet sheet = workbook.getSheet("Sheet1");
        int rowCount = sheet.getPhysicalNumberOfRows();
        Object[][] data = new Object[rowCount][2]; // row x col

        for (int i = 0; i < rowCount; i++)
        {
            HSSFRow row = sheet.getRow(i);

            data[i][0] = row.getCell(0).toString().trim();
            data[i][1] = row.getCell(1).toString().trim();
        }


/*
        data[0][0] = "admin";
        data[0][1] = "admin";  // 1st row

        data[1][0] = "invalid-1";
        data[1][1] = "invalid-1";  // 2nd row

        data[2][0] = "invalid-2";
        data[2][1] = "invalid-2";  // 3rd row

        data[3][0] = "invalid-3";
        data[3][1] = "invalid-3";  // 4th row*/

        return  data;
    }


}
