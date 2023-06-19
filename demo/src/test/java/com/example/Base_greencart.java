package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Arrays;


public class Base_greencart {
    public static void main(String[] args)  throws InterruptedException {       
        WebDriver driver = new ChromeDriver();
        int j = 0;

        String[] itemsNeeded = {"Brocolli","Beetroot","Cucumber","Apple","Pumpkin","Mushroom"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");    
        Thread.sleep(3000);        

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for(int i=0;i<products.size();i++)
        {
            //Brocolli - 1 Kg

            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();
                
                // format it get actual vegetable name

                // convert array into array list for easy search
                // check wether name you expected is present in arraylist or not

            List<String> itemsNeededlList = Arrays.asList(itemsNeeded);                

            if(itemsNeededlList.contains(formattedName))
            {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                
                if(j == itemsNeeded.length)
                {
                    break;
                }

            }
        }
        driver.quit();        
    }
}
