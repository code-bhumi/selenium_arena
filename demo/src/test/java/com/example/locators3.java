package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class locators3 {

    public static void main(String[] args) {

        System.setProperty("WebDriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver"); 
        WebDriver driver = new ChromeDriver();
        // Sibling - child to parent transvers

        //header/div/button[1]/following-sibling::botton[1]
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::botton[1]")).getText());
        System.out.println(driver.findElement(By.xpath("//header/div/button[2]")).getText());
   
   }
    
}
