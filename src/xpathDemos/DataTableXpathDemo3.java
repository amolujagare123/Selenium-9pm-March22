package xpathDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataTableXpathDemo3 {



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

            driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
            driver.findElement(By.xpath("//a[normalize-space()='View Customers']")).click();

            //----- now click on select checkbox ------

            String name = "kuldeep122"; // go to page 41 first

            //driver.findElement(By.xpath("//a[normalize-space()='41']")).click();

            driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(name);
            driver.findElement(By.xpath("//input[@name='Search']")).click();
            driver.findElement(By.xpath("//tr[td[text()='"+name+"']]//input")).click();
        }
}
