package com.selenium_framework.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium_framework.AbstractComponent.AbstractComponent;

public class CartPage extends AbstractComponent{ 

    WebDriver driver;

    @FindBy(css = ".totalRow button")
    WebElement checkoutProd;

    @FindBy(css = ".cartSection h3")
    private List<WebElement> cartProducts;

    public CartPage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Boolean VerifyProductDisplay(String productName)
    {
        Boolean match = cartProducts.stream().anyMatch(Product-> Product.getText().equalsIgnoreCase(productName));
        return match;
    }
    
    public CheckoutPage goToCheckout()  
    {
        checkoutProd.click();
        return new CheckoutPage(driver);
    }

    
    
}
