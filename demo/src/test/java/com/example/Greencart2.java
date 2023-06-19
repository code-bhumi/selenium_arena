package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.Arrays;
import java.time.Duration;


public class Greencart2 {
    public static void main(String[]args)  throws InterruptedException 
    {

        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        String[] itemsNeeded = {"Brocolli","Beetroot","Cucumber"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/"); 
        Thread.sleep(3000);  
        additems(driver, itemsNeeded);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
        //explicit wait
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
        driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();

    }

        public static void additems(WebDriver driver, String[] itemsNeeded ){

        int j = 0;

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
        
    }

}    

       