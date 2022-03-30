package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class SeleniumDemo {

    public static void main(String[] args) {

        // 1. open browser ( chrome )
       /* System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();*/

       /* System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();*/

     /*   System.setProperty("webdriver.opera.driver","Drivers/operadriver.exe");
        WebDriver driver = new OperaDriver();
*/

        System.setProperty("webdriver.edge.driver","Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();


        // 2. Maximize browser
        driver.manage().window().maximize();

        // 3. open url
        driver.get("http://facebook.com");

    }
}
