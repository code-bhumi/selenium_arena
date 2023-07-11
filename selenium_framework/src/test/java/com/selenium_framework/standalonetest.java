package com.selenium_framework;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class standalonetest {

     public static void main(String[] args)   throws InterruptedException
        {
    String productName = "zara coat 3";
            
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get("https://rahulshettyacademy.com/client");
            driver.findElement(By.id("userEmail")).sendKeys("ruhi_123@gmail.com");
            driver.findElement(By.id("userPassword")).sendKeys("Abcd@1234");
            driver.findElement(By.id("login")).click();
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".col-lg-4")));
            Thread.sleep(2000);
            WebElement product = driver.findElement(By.cssSelector("#products > div.container > div.row > div:nth-child(1) > div > div > button.btn.w-10.rounded"));           
            product.click();

            WebElement view = driver.findElement(By.cssSelector("#products > div.container > div.row > div:nth-child(1) > div > div > button.btn.w-40.rounded"));
            Thread.sleep(5000);
            Actions action = new Actions(driver);
            action.moveToElement(view).perform();
            // action.click().build().perform();
            Thread.sleep(3000);

            // WebElement prod = products.stream().filter(product->product.findElement
            // (By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);

            // prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();           
            // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
            // wait.until(ExpectedConditions.invisibilityOf(driver.findElement((By.cssSelector(".ng-animating")))));
            
            driver.findElement(By.cssSelector(".btn.btn-custom[routerlink='/dashboard/cart']")).click();

            List <WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
            Boolean match = cartProducts.stream().anyMatch(cartProduct-> cartProduct.getText().equalsIgnoreCase(productName));

            Assert.assertTrue(match);
            driver.findElement(By.cssSelector(".totalRow button")).click();

            Actions a = new Actions(driver);
            a.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Select Country']")), "India").build().perform();
            
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
            
            driver.findElement(By.cssSelector(".ta-item:nth-of-type(2)")).click();
            driver.findElement(By.cssSelector(".action__submit")).click();
            String confirmMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
            Assert.assertTrue(confirmMessage.equalsIgnoreCase(("THANKYOU FOR THE ORDER.")));
            //driver.close();

        }
    
}
