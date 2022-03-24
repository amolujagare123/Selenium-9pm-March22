package CSSSelectorDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/s?k=amol+ujagare");

      //  driver.findElement(By.cssSelector("img[alt='Practical Approach of Software Testing' ]")).click();
      //  driver.findElement(By.cssSelector("img[alt^= 'Practical']")).click();
        driver.findElement(By.cssSelector("img[alt*= 'of Softw']")).click();
    }
}
