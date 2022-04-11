package DataDProviderDemo;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class AddCusomer {
    WebDriver driver;

    @BeforeClass
    public void DoLogin() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

    @Test (dataProvider = "getData")
    public void addCustomerTest(String name,String address,String contact1,String contact2)
    {
        driver.findElement(By.xpath("//a[normalize-space()='Add Customer']")).click();

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
        driver.findElement(By.xpath("//textarea[@placeholder='ENTER YOUR ADDRESS']")).sendKeys(address);
        driver.findElement(By.xpath("//input[@id='buyingrate']")).sendKeys(contact1);
        driver.findElement(By.xpath("//input[@id='sellingrate']")).sendKeys(contact2);

        driver.findElement(By.xpath("//input[@name='Submit']")).click();
    }


    @DataProvider
    public Object[][] getData() throws IOException {
        FileInputStream fis = new FileInputStream("Data/MyData.xls");
        HSSFWorkbook workbook = new HSSFWorkbook(fis);
        HSSFSheet sheet = workbook.getSheet("add customer");
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount][colCount];

        for (int i =0; i<rowCount;i++)
        {
            HSSFRow row = sheet.getRow(i);

            for(int j=0;j<colCount;j++)
            {
                data[i][j] = row.getCell(j).toString().trim();
            }
        }
        return data;
    }
}
