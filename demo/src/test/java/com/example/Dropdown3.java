package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown3{

    public static void main(String[] args)  throws InterruptedException {

         
        WebDriver driver = new ChromeDriver();
        if (driver != null) 
        {
            driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

            // //a[@value='BLR']   
            // //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR'] (parent child x path)
            // (//a[@value='MAA'])[2]   
            // //div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA'] (parent child x path)

            driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
            System.out.println("step 1");
            driver.findElement(By.xpath("//a[@value='BLR']")).click();
            Thread.sleep(2000);
            System.out.println("step 2");
            driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); 
            Thread.sleep(2000);
            System.out.println("step 3");
            // below steps for parent child x path
            //driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
            System.out.println("step 4");
            Thread.sleep(2000);
            //driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
            System.out.println("step 5");
            Thread.sleep(2000);
            System.out.println("================================================================================");
            //System.out.println(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active"));
            System.out.println("================================================================================");
            driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
            System.out.println("step 6");
        }
    }
}    