package com.example;
import org.openqa.selenium.By;	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browseractivity {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        if (driver != null) {
            driver.manage().window().maximize();
            driver.get("https://google.com");
            try {
                Thread.sleep(2000); 
            } catch(InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>> Let's click on the I am feeling lucky");
            driver.findElement(By.xpath("//input[@class='RNmpXc']")).click();
            try {
                Thread.sleep(2000); 
            } catch(InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>> now go back");
            driver.navigate().back();
            try {
                Thread.sleep(2000); 
            } catch(InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>> now go forward");
            driver.navigate().forward();
            driver.close();
        }
    }
}    