package com.adwita;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.locators.RelativeLocator.*;



public class Relative_Locators {
    public static void main(String[] args)  throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement nameEditbox = driver.findElement(By.cssSelector("[name='name']"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditbox)).getText());
        WebElement dob = driver.findElement(By.cssSelector("[for='dateofBirth']"));
        driver.findElement(with(By.tagName("input")).below(dob)).click();
        WebElement iceCreamText = driver.findElement(By.cssSelector("label[class='form-check-label']"));
        driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamText)).click();
        WebElement radioButton = driver.findElement(By.cssSelector("[id='inlineRadio1']"));
        System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radioButton)).getText());
       
    }
}
