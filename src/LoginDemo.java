import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class LoginDemo {

    public static void main(String[] args) {

        /*System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();*/

        /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();*/

        /*WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();*/

       /* WebDriverManager.operadriver().setup();
        WebDriver driver = new OperaDriver();
*/
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();


        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");


        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();


    }
}
