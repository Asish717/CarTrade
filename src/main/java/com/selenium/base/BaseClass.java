package com.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;
    public void setup(){
        ChromeOptions opt=new ChromeOptions();
        opt.addArguments("--disable-notifications","--disable-geolocation");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cartrade.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}
