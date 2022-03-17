package xpathDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUser.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();

        driver.findElement(By.linkText("Add Customer")).click();

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Aruna");
        driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("xyz");
        driver.findElement(By.xpath("//input[@name='contact1']")).sendKeys("56565");
        driver.findElement(By.xpath("//input[@name='contact2']")).sendKeys("65656");
        driver.findElement(By.xpath("//input[@name='Submit']")).click();

    }
}
