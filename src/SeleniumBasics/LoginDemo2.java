package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/v4/");

       WebElement txtUserName =  driver.findElement(By.name("uid"));
       txtUserName.sendKeys("mngr391877");

       WebElement txtPassword = driver.findElement(By.name("password"));
       txtPassword.sendKeys("qYgAvUz");

        WebElement btnLogin = driver.findElement(By.name("btnLogin"));
        btnLogin.click();

        driver.findElement(By.linkText("New Customer")).click();

        driver.navigate().refresh();

        driver.navigate().to("https://demo.guru99.com/v4/manager/addcustomerpage.php");

        driver.findElement(By.name("name")).sendKeys("Prafulla");

        driver.findElement(By.name("addr")).sendKeys("xyz");

        driver.findElement(By.name("city")).sendKeys("Pune");

        driver.findElement(By.name("state")).sendKeys("Maharastra");

        driver.findElement(By.name("pinno")).sendKeys("4140046");

        driver.findElement(By.name("telephoneno")).sendKeys("787878");

        driver.findElement(By.name("emailid")).sendKeys("prafulla@gmail.com");

        driver.findElement(By.name("password")).sendKeys("1234");

        driver.findElement(By.name("sub")).click();


        Alert alert = driver.switchTo().alert();
       // alert.accept();
        System.out.println(alert.getText());
        alert.dismiss();


    }
}
