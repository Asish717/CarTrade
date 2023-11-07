package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class Method2 {
    WebDriver driver;
    @FindBy(id = "ucity")
    WebElement location;
    @FindBy(xpath = "//input[@value='all used cars']")
    WebElement submitButton;
    @FindBy(id = "Tata")
    WebElement companyName;
    @FindBy(id = "501")
    WebElement modelName;
    @FindBy(xpath = "//*[@id=\"S2765677\"]/div[2]/div/h2/a")
    WebElement select;
    @FindBy(xpath = "//span[text()='XZA Plus (O) Dark Edition']")
    WebElement check;
    public Method2(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public String searchMethod2() throws InterruptedException, AWTException {
        location.sendKeys("Visakhapatnam");
        submitButton.click();
        Thread.sleep(500);
        companyName.click();
        Thread.sleep(500);
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(500);
        modelName.click();
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(500);
        select.click();
        Thread.sleep(500);
        String parentHandle=driver.getWindowHandle();
        Set<String>child=driver.getWindowHandles();
        for (String handle:child){
            driver.switchTo().window(handle);
        }
        System.out.println("child handles 2 : "+child);
        System.out.println("parent handle 2 : "+parentHandle);
        Thread.sleep(500);
        String checkText=check.getText();
        Thread.sleep(2000);
        return checkText;
    }
}
//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("window.scrollBy(0,350)", "");