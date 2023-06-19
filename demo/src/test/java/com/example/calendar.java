package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {
    public static void main(String[] args)   throws InterruptedException
    {        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.path2usa.com/travel-companion/");
        
        // april 14

        driver.findElement(By.xpath(".//*[@id='form-field-travel_comp_date']")).click();
        
        while(!driver.findElement(By.cssSelector("[class='flatpickr-month'][class='cur-month']")).getText().contains("August"))
        {
            driver.findElement(By.xpath("//span[@class='flatpickr-next-month']//*[name()='svg']")).click();
        }

        // List<WebElement> dates=driver.findElements(By.cssSelector(".flatpickr-day"));

        // int count = driver.findElements(By.cssSelector(".flatpickr-day")).size();

        // for(int i=0;i<count;i++)
        // {
        //     String text = driver.findElements(By.cssSelector(".flatpickr-day")).get(i).getText();
        //     if(text.equalsIgnoreCase("27"))
        //     {
        //         driver.findElements(By.cssSelector(".flatpickr-day")).get(i).click();
        //         break;
        //     }
        // }
    }


}    
