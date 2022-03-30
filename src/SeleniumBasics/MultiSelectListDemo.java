package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListDemo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");

        WebElement multiList = driver.findElement(By.id("multiSel"));

        Thread.sleep(4000);

        Select selMultiList = new Select(multiList);

        selMultiList.selectByVisibleText("text 1");
        selMultiList.selectByIndex(1);
        selMultiList.selectByVisibleText("text 4");

        Thread.sleep(4000);

      // selMultiList.deselectByVisibleText("text 1");
      //  selMultiList.deselectByIndex(1);

        selMultiList.deselectAll();




    }
}
