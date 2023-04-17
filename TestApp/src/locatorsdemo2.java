import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class locatorsdemo2 {
    public static void main(String[] args) throws InterruptedException
    {
       
         // implicit wait -- 2 sec timeout

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Meenakshi");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.tagName("p")).getText());
        

    }
    
}    
