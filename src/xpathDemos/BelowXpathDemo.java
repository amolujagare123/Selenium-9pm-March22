package xpathDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class BelowXpathDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        WebElement lnkForgotPass = driver.findElement(By.xpath("//a[text()='Forgot your password?']"));
        // feature available in selenium 4 and above
        WebElement btnLogin = driver.findElement(with(By.tagName("input")).toRightOf(lnkForgotPass));

        btnLogin.click();

    }
}
