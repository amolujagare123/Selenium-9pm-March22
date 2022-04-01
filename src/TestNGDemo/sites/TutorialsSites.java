package TestNGDemo.sites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialsSites {

    WebDriver driver;

    @BeforeClass
    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }

    @Test
    public void scriptinglogic()
    {
        driver.get("http://scriptinglogic.com");
    }

    @Test
    public void javatpoint()
    {
        driver.get("https://www.javatpoint.com/");
    }

    @Test
    public void w3schools()
    {
        driver.get("https://www.w3schools.com/");
    }

    @Test
    public void geeksforgeeks()
    {
        driver.get("https://www.geeksforgeeks.org/");
    }


}
