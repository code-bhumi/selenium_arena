package com.selenium_framework.pageobjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium_framework.AbstractComponent.AbstractComponent;

public class OrderPage extends AbstractComponent{ 

    WebDriver driver;

    @FindBy(css = ".totalRow button")
    WebElement checkoutProd;

    @FindBy(css = "tr td:nth-child(3)")
    private List<WebElement> ProductNames;

    public OrderPage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Boolean VerifyOrderDisplay(String productName)
    {
        Boolean match = ProductNames.stream().anyMatch(Product-> Product.getText().equalsIgnoreCase(productName));
        return match;
    }
    
  
    
    
}
