package com.selenium_framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium_framework.AbstractComponent.AbstractComponent;

public class LandingPage extends AbstractComponent {

        WebDriver driver;

        public LandingPage(WebDriver driver)
        {
            super(driver);
            //initialization
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        //WebElement userEmail = driver.findElement(By.id("userEmail"));
        // page factory

        @FindBy(id = "userEmail")
        WebElement Email;

        @FindBy(id = "userPassword")
        WebElement passwordEle;


        @FindBy(id = "login")
        WebElement submit;

        public ProductCatalogue loginApplication(String email, String password)
        {
            Email.sendKeys(email);
            passwordEle.sendKeys(password);
            submit.click();
            ProductCatalogue productCatalogue = new ProductCatalogue(driver);
            return productCatalogue;
        }

        public void goTo()
        {
            driver.get("https://rahulshettyacademy.com/client");
        }





    
}
