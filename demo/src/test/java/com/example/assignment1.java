package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class assignment1 {   

    public static void main(String[] args)  throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector("[id='checkBoxOption1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[id='checkBoxOption1']")).click();
        driver.quit();
    }
    
}
