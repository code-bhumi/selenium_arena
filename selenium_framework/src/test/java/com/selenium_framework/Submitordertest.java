package com.selenium_framework;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.selenium_framework.pageobjects.CartPage;
import com.selenium_framework.pageobjects.CheckoutPage;
import com.selenium_framework.pageobjects.ConfirmationPage;
import com.selenium_framework.pageobjects.OrderPage;
import com.selenium_framework.pageobjects.ProductCatalogue;
import selenium_framework.TestComponent.BaseTest;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Submitordertest extends BaseTest {

    String productName = "zara coat 3"; 
    BaseTest bt = new BaseTest();
    
    @Test(dataProvider="getData", groups = {"Purchase"})

    public void submitordertest(HashMap<String,String> input)   throws IOException, InterruptedException
    {
                        
        ProductCatalogue productCatalogue = bt.launchApplication().loginApplication(input.get("email"), input.get("password"));            
        productCatalogue.getProduct();
        productCatalogue.addPrtoductToCart(input.get("product"));
        Thread.sleep(2000);
        CartPage cartPage = productCatalogue.goToCartPage();       
        Boolean match = cartPage.VerifyProductDisplay(input.get("product"));
        Assert.assertTrue(match);          
        CheckoutPage checkoutPage = cartPage.goToCheckout();
        checkoutPage.selectCountry(("India"));
        ConfirmationPage confirmationPage = checkoutPage.submitOrder();
        String confirmMessage = confirmationPage.getConfirmationMessage();
        Assert.assertTrue(confirmMessage.equalsIgnoreCase(("THANKYOU FOR THE ORDER.")));               
    }

    @Test(dependsOnMethods = {"submitordertest"})
    public void OrderHistoryTest() throws IOException
    {
        ProductCatalogue productCatalogue = bt.launchApplication().loginApplication("ruhi_123@gmail.com", "Abcd@1234"); 
        OrderPage orderPage = productCatalogue.goToOrderPage();
        Assert.assertTrue(orderPage.VerifyOrderDisplay(productName));
    } 

    public String getScreenshot(String TestCaseName) throws IOException
    {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File file = new File(System.getProperty("user.dir")+ "//reports//"+ TestCaseName + ".png");
        FileUtils.copyFile(source, file);
        return System.getProperty("user.dir")+ "//reports//"+ TestCaseName + ".png";
    }
    
    
    @DataProvider
    public Object [][] getData()   throws IOException
    {
        List<HashMap<String, String>> data = getJsonDataToMap(System.getProperty("user.dir") + "/src/test/java/Sel_Framework/data/PurchaseOrder.json");
        return new Object[][]{{data.get(0)},{data.get(1)}};
    }
}

        // HashMap<String,String> map = new HashMap<String,String>();
        // map.put("email", "ruhi_123@gmail.com");
        // map.put("password", "Abcd@1234");
        // map.put("product", "ZARA COAT 3");

        // HashMap<String,String> map1 = new HashMap<String,String>();
        // map1.put("email", "shetty@gmail.com");
        // map1.put("password", "Iamking@000");
        // map1.put("product",  "ADIDAS ORIGINAL");
       
        
