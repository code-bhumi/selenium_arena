package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.List;


public class Airindia_Calender 
{

    public static void main(String[] args)   throws InterruptedException
    {        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.airindia.com/in/en/book/search-flights.html");

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("[class='date-field col-6 col-lg-5']")).click();     

        WebElement month = driver.findElement(By.cssSelector("div[class='date-field col-6 col-lg-5'] input[type='button']"));
        month.sendKeys("Jul");


        // {
            
        //     {
        //         driver.findElement(By.cssSelector("[class='dropdown-menu show ng-star-inserted'] [class='ngb-dp-arrow right'] [class='btn btn-link ngb-dp-arrow-btn']")).click();
                
        //     }
        // }

        Thread.sleep(5000);

        //List<WebElement> dates = driver.findElements(By.cssSelector(".custom-day.ng-star-inserted"));
        
        int count =driver.findElements(By.cssSelector(".custom-day.ng-star-inserted")).size();

        for(int i=0;i<count;i++)
        {
            String text = driver.findElements(By.cssSelector(".custom-day.ng-star-inserted")).get(i).getText();
            if(text.equalsIgnoreCase("28"))
            {
                driver.findElements(By.cssSelector(".custom-day.ng-star-inserted")).get(i).click();
                break;
            }
        }    
        
   
    }

    
}
