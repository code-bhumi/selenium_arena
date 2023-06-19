package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Assignment3 {

    public static  void main(String[] args)   throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("//label[2]//span[2]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();        
        WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
        options.sendKeys("consult");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='terms']")).click();
        driver.findElement(By.id("signInBtn")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(("Checkout"))));
        
        List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
        for(int i = 0; i < products.size();i++)
        {
            products.get(i).click();        
        }
        
        
        driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
        driver.findElement(By.cssSelector("button[class='btn btn-success']")).click();

    }
    
}
