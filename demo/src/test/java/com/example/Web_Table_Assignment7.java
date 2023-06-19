package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;


public class Web_Table_Assignment7 
{

    public static void main(String[] args)   throws InterruptedException
    {        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement Webtable = driver.findElement(By.id("product"));
        System.out.println(Webtable.findElements(By.tagName("tr")).size());
        System.out.println(Webtable.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
        List<WebElement> data = Webtable.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
        System.out.println(data.get(0).getText());
        System.out.println(data.get(1).getText());
        System.out.println(data.get(2).getText());
        
    }  
    
}
