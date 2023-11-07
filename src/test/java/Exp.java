import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Exp {
    public static WebDriver driver;

    public static void main(String[] args) {
//        ChromeOptions opt=new ChromeOptions();
//        opt.addArguments("--disable-notifications");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.id("email")).sendKeys("12234");
        driver.findElement(By.id("pass")).sendKeys("53215");
        
    }
}
