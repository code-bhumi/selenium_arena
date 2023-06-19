package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class FrameTest
{
    public static void main(String[] args)   
    {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        //System.out.println(driver.findElement(By.tagName("iframe")).size());
        //driver.switchTo().frame(0);
     
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));        
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        Actions a = new Actions(driver);
    
        a.dragAndDrop(source, target).build().perform();
        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector("a[href='https://jqueryui.com/selectable/']")).click();
    }
    
}
