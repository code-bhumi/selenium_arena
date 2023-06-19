package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class assignment1b {

    public static void main(String[] args)  throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        driver.quit();
    }
    
}
