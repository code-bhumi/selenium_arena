package com.example;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;


public class Miscelleanous {
    public static void main(String[] args) throws InterruptedException, IOException 
    {        
  
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    //  driver.manage().deleteCookieNamed("sessionkey");

        // click on any link 
        // log in page - verify logi url
        
        driver.get("http://google.com");
        System.out.println(driver.getTitle());  
        
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("/home/dimple/meenakshi/java/screeshot.png"));
    }  
}
   