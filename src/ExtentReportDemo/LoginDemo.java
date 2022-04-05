package ExtentReportDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginDemo {

    ExtentReports extent;
    ExtentSparkReporter reporter;

    @BeforeClass
    public void initExtentReport()
    {
        reporter = new ExtentSparkReporter("Reports/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setReportName("Regression Tests");
        reporter.config().setDocumentTitle("Stock Management system");

        extent.setSystemInfo("Developers Name","Anand");
        extent.setSystemInfo("Testers Name","Shobit");
        extent.setSystemInfo("Client","Infosys");
        extent.setSystemInfo("Project End Date","22/06/2022");
    }


    @AfterClass
    public void writeToReport()
    {
        extent.flush();
    }



    @Test
    public void loginTest1()
    {
        ExtentTest test = extent.createTest("valid login");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        test.info("browser is opened and maximized");

        driver.get("https://stock.scriptinglogic.net/");

        test.info("url is opened");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");

    }

    @Test
    public void loginTest2()
    {
        ExtentTest test = extent.createTest("invalid login");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        test.info("browser is opened and maximized");

        driver.get("https://stock.scriptinglogic.net/");

        test.info("url is opened");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("trtr3434");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("trt3434");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");

    }

    @Test
    public void loginTest3()
    {
        ExtentTest test = extent.createTest("blank login");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        test.info("browser is opened and maximized");

        driver.get("https://stock.scriptinglogic.net/");

        test.info("url is opened");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");

    }
}
