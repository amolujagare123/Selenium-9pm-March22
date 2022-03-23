package xpathDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataTableXpathDemo1 {

    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://openclinic.sourceforge.net/openclinic/admin/staff_list.php");


        String name = "AGUILAR";
        driver.findElement(By.xpath("//tr[td[text()='"+name+"']]//img[@alt='edit']")).click();
    }
}
