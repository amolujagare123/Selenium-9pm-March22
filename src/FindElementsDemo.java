import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

       // driver.findElement(By.tagName("input")).sendKeys("xyz"); // 3

        // if there are multiple webelements represented by some locator
        // using find elements if you are trying to find then this will pick up
        // the first element

        List<WebElement> wbList = driver.findElements(By.tagName("input"));

        // how can I find how many web elements are there in this list

        System.out.println("number of elements ="+wbList.size());

        // how to get first element of the list

        wbList.get(0).sendKeys("admin");
        wbList.get(1).sendKeys("admin");
        wbList.get(2).click();

    }
}
