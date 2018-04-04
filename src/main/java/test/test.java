package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {


    @Test
    public void testMethod() throws Exception{
        System.out.println("hello world from testng");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\1022880\\Desktop\\Softwares\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        Thread.sleep(1000);
        driver.close();
    }
}
