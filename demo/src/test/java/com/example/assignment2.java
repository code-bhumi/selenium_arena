package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {
    public static void main(String[] args)  throws InterruptedException
    {
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.cssSelector("input[class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys("Meenakshi");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("rahulshettyacademy.com");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("abc123xyz456");
        driver.findElement(By.id("exampleCheck1")).click();     
        WebElement element = driver.findElement(By.cssSelector("select[id='exampleFormControlSelect1']"));
        element.sendKeys("Female");
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("25/03/1986");
        driver.findElement(By.cssSelector("input[class='btn btn-success']")).click();
        System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
    }
    
}
