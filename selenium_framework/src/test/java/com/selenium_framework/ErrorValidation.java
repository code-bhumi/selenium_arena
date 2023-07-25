package com.selenium_framework;

import java.io.IOException;
import org.junit.Assert;
import org.testng.annotations.Test;
import com.selenium_framework.pageobjects.CartPage;
import com.selenium_framework.pageobjects.ProductCatalogue;
import selenium_framework.TestComponent.BaseTest;

public class ErrorValidation extends BaseTest  
{
    @Test (groups = {"ErrorHandling"})
    public  void loginErrorValidation()   throws IOException, InterruptedException
            {
                BaseTest bt = new BaseTest();      
                bt.launchApplication().loginApplication("abcd@gmail.com", "sdefc584");  
                Assert.assertEquals("Incorrect email or password.", bt.launchApplication().getErrorMessage());                                
            }

    @Test
    public  void productErrorValidation()   throws IOException, InterruptedException
            {
                BaseTest bt = new BaseTest();
                String productName = "zara coat 3";           
                ProductCatalogue productCatalogue = bt.launchApplication().loginApplication("ruhi_123@gmail.com", "Abcd@1234");            
                productCatalogue.getProduct();
                productCatalogue.addPrtoductToCart(productName);
                Thread.sleep(1000);
                CartPage cartPage = productCatalogue.goToCartPage();       
                Boolean match = cartPage.VerifyProductDisplay("Zara coat 33");
                Assert.assertFalse(match);                             
            }        


}
