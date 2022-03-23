package xpathDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class BelowPasswordXpathDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        WebElement lblPassword = driver.findElement(By.xpath("//label[text()='password']"));

        // feature available in selenium 4 and above
        WebElement txtPassword = driver.findElement(with(By.tagName("input")).below(lblPassword));

        txtPassword.sendKeys("abcdefg");
    }
}
