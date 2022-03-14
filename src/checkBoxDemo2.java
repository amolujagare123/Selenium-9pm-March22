import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxDemo2 {

    public static void main(String[] args) throws InterruptedException {


        // un-tick all the checkboxes

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/Scriptinglogic%20docs/class%20Activities/Selenium/Mywebsite/amol.html");

        WebElement checkJava = driver.findElement(By.id("check0"));
        WebElement checkSelenium = driver.findElement(By.id("check1"));
        WebElement checkCucumber = driver.findElement(By.id("check2"));

        Thread.sleep(2000);

        if(checkJava.isSelected()) // true /false
            checkJava.click();

        if(checkSelenium.isSelected()) // true /false
            checkSelenium.click();

        if(checkCucumber.isSelected()) // true /false
            checkCucumber.click();



    }
}
