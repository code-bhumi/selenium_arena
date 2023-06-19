package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Complete_Dropdown_Assignment8 {

    public static void main(String[] args)   throws InterruptedException
    {        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("autocomplete")).sendKeys("Ind");
        Thread.sleep(5000);
        driver.findElement(By.id("autocomplete")).sendKeys((Keys.DOWN));
        driver.findElement(By.id("autocomplete")).sendKeys((Keys.DOWN));

        System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
                
    }  
    
}
