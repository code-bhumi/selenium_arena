package com.selenium_framework;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.selenium_framework.pageobjects.CartPage;
import com.selenium_framework.pageobjects.CheckoutPage;
import com.selenium_framework.pageobjects.ConfirmationPage;
import com.selenium_framework.pageobjects.LandingPage;
import com.selenium_framework.pageobjects.ProductCatalogue;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Submitordertest_orignal 
{
    public static void main(String[] args)   throws InterruptedException
        {
            String productName = "zara coat 3";
            
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize(); 
            new WebDriverWait(driver, Duration.ofSeconds(5));
            LandingPage landingPage = new LandingPage(driver);
            landingPage.goTo();
            ProductCatalogue productCatalogue = landingPage.loginApplication("ruhi_123@gmail.com", "Abcd@1234");            
            productCatalogue.getProduct();
            productCatalogue.addPrtoductToCart(productName);
            Thread.sleep(1000);
            CartPage cartPage = productCatalogue.goToCartPage();       
            Boolean match = cartPage.VerifyProductDisplay(productName);
            Assert.assertTrue(match);          
            CheckoutPage checkoutPage = cartPage.goToCheckout();
            checkoutPage.selectCountry(("India"));
            ConfirmationPage confirmationPage = checkoutPage.submitOrder();
            String confirmMessage = confirmationPage.getConfirmationMessage();
            Assert.assertTrue(confirmMessage.equalsIgnoreCase(("THANKYOU FOR THE ORDER.")));
            driver.close();  
            
        }
    
}
