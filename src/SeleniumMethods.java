import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://gmail.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.navigate().to("http://facebook.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.close(); // closes current window

      //  driver.quit(); // closes all windows opened by the driver
    }
}
