import io.netty.handler.codec.compression.ZstdOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsAssign2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://scriptinglogic.org");
        List<WebElement> btnList=driver.findElements(By.className("elementor-button-text"));
        System.out.println("size of btnList="+btnList.size());
        for(int i=0;i<btnList.size();i++){
            System.out.println(btnList.get(i).getText());
        }
        btnList.get(1).click();

        driver.navigate().back();
        //driver.navigate().refresh();
        Thread.sleep(4000);
        List<WebElement> btnList1=driver.findElements(By.className("elementor-button-text"));

        for(int i=0;i<btnList1.size();i++){
            System.out.println(btnList1.get(i).getText());
        }
        btnList1.get(3).click(); //getting error when i try to click on Buy now button.

    }
}
