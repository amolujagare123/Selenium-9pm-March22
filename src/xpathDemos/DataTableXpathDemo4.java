package xpathDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataTableXpathDemo4 {



        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.get("https://billing.scriptinglogic.net/");

            WebElement txtUser = driver.findElement(By.xpath("//input[@id='email']"));
            txtUser.sendKeys("amolujagare@gmail.com");

            WebElement txtPassword = driver.findElement(By.xpath("//input[@id='password']"));
            txtPassword.sendKeys("admin123");

            WebElement btnLogin = driver.findElement(By.xpath("//input[@name='btn_login']"));
            btnLogin.click();

            driver.findElement(By.xpath("//span[normalize-space()='Clients']")).click();
            driver.findElement(By.xpath("//a[normalize-space()='View Clients']")).click();

            //----- now click on select checkbox ------

            String name = "Ajay Mathur";
          driver.findElement(By.xpath("//tr[td/a[text()='"+name+"']]//div")).click();

         driver.findElement(By.xpath("//tr[td/a[text()='Ajay Mathur']]//li[2]")).click();

            //tr[td/a[text()='Ajay Mathur']]//a[contains(@href,'form')]
            //tr[td/a[text()='Ajay Mathur']]//i[contains(@class,'edit')]



        }
}
