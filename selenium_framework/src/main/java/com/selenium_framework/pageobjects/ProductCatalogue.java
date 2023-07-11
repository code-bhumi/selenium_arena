package com.selenium_framework.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.selenium_framework.AbstractComponent.AbstractComponent;

public class ProductCatalogue extends AbstractComponent{

        WebDriver driver;

        public ProductCatalogue(WebDriver driver)
        {
            super(driver);
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(css = "#products > div.container > div.row > div:nth-child(1) > div > div > button.btn.w-10.rounded")
        WebElement product;

        @FindBy(css = ".ng-animating")
        WebElement spinner;

        By toastMessage = By.cssSelector("#toast-container");

        public WebElement getProduct()
        {
            return product;
            
        }   

        public void addPrtoductToCart(String productName)
        {
            product.click();
            // waitForElementToAppear(toastMessage);
            // waitForElementToDisappear(spinner);
            

        }  
         
}
