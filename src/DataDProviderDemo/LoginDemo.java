package DataDProviderDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDemo {

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
    public Object[][] getData()
    {
        Object[][] data = new Object[4][2]; // row x col

        data[0][0] = "admin";
        data[0][1] = "admin";  // 1st row

        data[1][0] = "invalid-1";
        data[1][1] = "invalid-1";  // 2nd row

        data[2][0] = "invalid-2";
        data[2][1] = "invalid-2";  // 3rd row

        data[3][0] = "invalid-3";
        data[3][1] = "invalid-3";  // 4th row

        return  data;
    }


}
