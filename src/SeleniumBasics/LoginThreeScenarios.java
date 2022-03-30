package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginThreeScenarios {

    public static void main(String[] args) {

        //1. valid credentils login
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.close();

        //2. invalid credentils login
        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();

        driver1.manage().window().maximize();
        driver1.get("https://stock.scriptinglogic.net/");


        WebElement txtUser1 = driver1.findElement(By.id("login-username"));
        txtUser1.sendKeys("fdfd");

        WebElement txtPassword1 = driver1.findElement(By.id("login-password"));
        txtPassword1.sendKeys("fdfdf");

        WebElement btnLogin1 = driver1.findElement(By.name("submit"));
        btnLogin1.click();

        driver1.close();

        //3. blank credentils login
        WebDriverManager.chromedriver().setup();
        WebDriver driver2 = new ChromeDriver();

        driver2.manage().window().maximize();
        driver2.get("https://stock.scriptinglogic.net/");


        WebElement txtUser2 = driver2.findElement(By.id("login-username"));
        txtUser2.sendKeys("");

        WebElement txtPassword2 = driver2.findElement(By.id("login-password"));
        txtPassword2.sendKeys("");

        WebElement btnLogin2 = driver2.findElement(By.name("submit"));
        btnLogin2.click();

        driver2.close();
    }
}
