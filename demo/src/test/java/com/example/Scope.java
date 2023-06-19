package com.example;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;


public class Scope
{
    public static void main(String[] args)   throws InterruptedException
    {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println("................good...............");
        System.out.println(driver.findElements(By.tagName("a")).size());
        System.out.println("................good...............");
        WebElement Footerdriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(Footerdriver.findElements(By.tagName("a")).size());
        System.out.println("................good...............");  
        WebElement coloumndriver = Footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(coloumndriver.findElements(By.tagName("a")).size());  

        for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
        {
            String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
            coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
            Thread.sleep(5000L);
        }
        
        Set<String> abc = driver.getWindowHandles();
        Iterator<String> it = abc.iterator();

        while(it.hasNext())
        {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }
        
        driver.quit();
    
    }
    
}
