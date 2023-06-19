package com.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Max_del_cookies {
    public static void main(String[] args)   throws InterruptedException
    {        
  
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    //  driver.manage().deleteCookieNamed("sessionkey");

        // click on any link 
        // log in page - verify logi url
        
        driver.get("http://google.com");
        System.out.println(driver.getTitle());       
        
        
    }  
}
    

