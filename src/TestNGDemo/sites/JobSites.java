package TestNGDemo.sites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSites extends InitDriver {



    @Test
    public void naukri()
    {
        driver.get("http://naukri.com");

    }

    @Test
    public void monster()
    {
        driver.get("http://monster.com");

        Assert.assertEquals(driver.getTitle(),"monsters","Wrong page title");
    }

    @Test
    public void shine()
    {
        driver.get("http://shine.com");
    }


    @Test
    public void timesjobs()
    {
        driver.get("https://www.timesjobs.com/");
    }

}
