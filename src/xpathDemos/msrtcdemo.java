package xpathDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class msrtcdemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://msrtc.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));

        WebElement txtroutemap = driver.findElement(By.xpath("//div[@id='e2']/a[contains(@href,'msrtc')]"));

        txtroutemap.click();

    }
}
