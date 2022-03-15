import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("file:///D:/Scriptinglogic%20docs/class%20Activities/Selenium/Mywebsite/amol.html");

        // 1. find the web element
        WebElement drpNameList =  driver.findElement(By.id("seltext"));

        // 2. Create the Object of select class
        Select selNameList = new Select(drpNameList);

        // 3. Select the element ( visible text / value / index )

       // selNameList.selectByVisibleText("raj");
       // selNameList.selectByIndex(2);
        selNameList.selectByValue("v12");

    }
}
