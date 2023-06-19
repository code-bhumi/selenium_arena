package com.example;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;



public class Assignment4 
{
    public static void main(String[] args)  
    {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.cssSelector("a[href='/windows']")).click();
        driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String>it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        System.out.println("....................good....................");
        System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());
        System.out.println("....................good....................");
        driver.switchTo().window(parentId);
        System.out.println("....................good....................");
        System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
        System.out.println("....................good....................");
        driver.quit();
           
    }
    
}
