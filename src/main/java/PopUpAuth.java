import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAuth {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\1022880\\Desktop\\Softwares\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://borderwise-runway-2.yjgnukdesg.us-east-1.elasticbeanstalk.com/");
        driver.findElement(By.id("userID")).sendKeys("borderwise-runway");
        driver.findElement(By.id("password")).sendKeys("apr1gVE10SuKWXb60RR@");

        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.switchTo().defaultContent();

//borderwise-runway:apr1gVE10SuKWXb60RR@
    }
}
