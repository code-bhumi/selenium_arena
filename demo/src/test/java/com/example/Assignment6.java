package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment6
{
    public static void main(String[] args)   throws InterruptedException
    {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/lable[3]/input")).click();
        System.out.println("................check...............");
        String choice = driver.findElement(By.cssSelector("label[for='honda']")).getText();
        System.out.println(choice);        
        System.out.println("................check...............");
        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
        Select option = new Select(dropdown);
        option.selectByVisibleText(choice);
        System.out.println("................check...............");
        Thread.sleep(5000);
        driver.findElement(By.name("enter-name")).sendKeys(choice);
        driver.findElement(By.id("alertbtn")).click();
        String abc = driver.switchTo().alert().getText();
        if(abc.contains(choice))
        {
            System.out.println("you got it");
        }
        else

        System.out.println("Try again something went wrong");

    }
    
}    
