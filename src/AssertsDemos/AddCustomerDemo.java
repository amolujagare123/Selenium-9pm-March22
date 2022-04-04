package AssertsDemos;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCustomerDemo {

    @Test
    public void addCustomerTest()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");


        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.findElement(By.xpath("//a[normalize-space()='Add Customer']")).click();

        String name="Prafulla1";

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
        driver.findElement(By.xpath("//textarea[@placeholder='ENTER YOUR ADDRESS']")).sendKeys("XYZ");
        driver.findElement(By.xpath("//input[@id='buyingrate']")).sendKeys("35545454");
        driver.findElement(By.xpath("//input[@id='sellingrate']")).sendKeys("545454");

        driver.findElement(By.xpath("//input[@name='Submit']")).click();


        String expected = "[ "+name+" ] Customer Details Added !";

        String actual ="";
        try {
            actual = driver.findElement(By.cssSelector(".confirmation-box")).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"user is not added");
    }


    @Test
    public void addCustomerTest2()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");


        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.findElement(By.xpath("//a[normalize-space()='Add Customer']")).click();

        String name="Prafulla1";

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
        driver.findElement(By.xpath("//textarea[@placeholder='ENTER YOUR ADDRESS']")).sendKeys("XYZ");
        driver.findElement(By.xpath("//input[@id='buyingrate']")).sendKeys("35545454");
        driver.findElement(By.xpath("//input[@id='sellingrate']")).sendKeys("545454");

        driver.findElement(By.xpath("//input[@name='Submit']")).click();


        String expected = "Customer Details Added !";

        String actual ="";
        try {
            actual = driver.findElement(By.cssSelector(".confirmation-box")).getText();
        }
        catch (Exception e)
        {

        }

        boolean result = actual.contains(expected);

        Assert.assertTrue(result,"Given message is not there in the actual result");
    }

    @Test
    public void addCustomerTest3()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");


        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.findElement(By.xpath("//a[normalize-space()='Add Customer']")).click();

        String name="Prafulla1";

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
        driver.findElement(By.xpath("//textarea[@placeholder='ENTER YOUR ADDRESS']")).sendKeys("XYZ");
        driver.findElement(By.xpath("//input[@id='buyingrate']")).sendKeys("35545454");
        driver.findElement(By.xpath("//input[@id='sellingrate']")).sendKeys("545454");

        driver.findElement(By.xpath("//input[@name='Submit']")).click();


        String expected = "Dublicat Entry. Please Verify";

        String actual ="";
        try {
            actual = driver.findElement(By.cssSelector(".error-box")).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"wrong message");
    }
}
