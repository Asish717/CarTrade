package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class SearchingCar {
    WebDriver driver;
    @FindBy(id = "ucity")
    WebElement location;
    @FindBy(xpath = "//input[@value='all used cars']")
    WebElement submitButton;
    @FindBy(id = "selectlistarrow1")
    WebElement priceOption;
    @FindBy(id = "carrate_4-5")
    WebElement priceRange;
    @FindBy(id = "selectlistarrow2")
    WebElement fuel;
    @FindBy(id = "fuel_Petrol")
    WebElement fuelType;
    @FindBy(id = "selectlistarrow3")
    WebElement kmTravelled;
    @FindBy(id = "kmsdriv_15000-30000")
    WebElement kmRange;
    @FindBy(id = "selectlistarrow4")
    WebElement age;
    @FindBy(id = "carage_2-4")
    WebElement ageRange;
    @FindBy(id = "selectlistarrow5")
    WebElement transmission;
    @FindBy(id = "gearbox_Automatic")
    WebElement transmissionType;
    @FindBy(id = "selectlistarrow6")
    WebElement body;
    @FindBy(id = "body_Hatchback")
    WebElement bodyType;
    @FindBy(xpath = "//*[@id=\"S2743163\"]/div[2]/div/h2/a")
    WebElement selecting;
    @FindBy(xpath = "//span[text()='CLIMBER 1.0 AMT [2019-2020]']")
    WebElement check;
    public SearchingCar(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public String selectingCar() throws InterruptedException {
        location.sendKeys("Visakhapatnam");
        submitButton.click();
        priceOption.click();
        Thread.sleep(500);
        priceRange.click();
        fuel.click();
        Thread.sleep(500);
        fuelType.click();
        kmTravelled.click();
        Thread.sleep(500);
        kmRange.click();
        age.click();
        Thread.sleep(500);
        ageRange.click();
        transmission.click();
        Thread.sleep(500);
        transmissionType.click();
        body.click();
        Thread.sleep(500);
        bodyType.click();
        Thread.sleep(200);
        selecting.click();
        Thread.sleep(500);
        String parentHandle=driver.getWindowHandle();
        Set<String> child=driver.getWindowHandles();
        for (String handle:child){
            driver.switchTo().window(handle);
        }
        System.out.println("child handles : "+child);
        System.out.println("parent handle : "+parentHandle);
        Thread.sleep(500);
        String checkText=check.getText();
        Thread.sleep(2000);
        return checkText;
    }
}
//*[@id="S2743163"]/div[2]/div/h2/a