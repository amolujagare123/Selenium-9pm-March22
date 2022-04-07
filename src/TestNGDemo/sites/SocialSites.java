package TestNGDemo.sites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites extends InitDriver{



    @Test (priority = 1)
    public void linkedIn()
    {
        driver.get("https://www.linkedin.com/");
    }

    @Test (priority = 2)
    public void facebook()
    {
        driver.get("https://facebook.com/");
    }

    @Test //(priority = 3,enabled = false)
    public void instagram()
    {
        driver.get("https://instagram.com/");
    }

    @Test (priority = 4)
    public void twitter()
    {
        driver.get("https://twitter.com/");
    }
}
