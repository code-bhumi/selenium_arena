package com.example;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;



public class Windowhandles 
{
    public static void main(String[] args)  
    {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.findElement(By.cssSelector(".blinkingText")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String>it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
        driver.findElement(By.cssSelector(".im-para.red")).getText();
        String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parentId);
        driver.findElement(By.id("username")).sendKeys(emailId);
        // another method to split
        // String []s1 = emailId.split(" ");
        // System.out.println("--------------------- debgging my code ----------------------------------");
        // System.out.println(emailId);
        // for (int i = 0; i < s1.length; i++) {
        //     if (s1[i].indexOf('@') != -1) {
        //         String []email_id = s1[i].split("@");
        //         System.out.println("first  part of email id == " + email_id[0]);
        //         System.out.println("second part of email id == " + email_id[1]);
        //     }
        // }
        // System.out.println("--------------------- debgging my code ----------------------------------");
        // driver.switchTo().window(parentId);
        // driver.findElement(By.id("username")).sendKeys(emailId);    
    }
    
}

