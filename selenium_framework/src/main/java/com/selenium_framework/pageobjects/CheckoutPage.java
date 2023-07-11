package com.selenium_framework.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium_framework.AbstractComponent.AbstractComponent;

public class CheckoutPage extends AbstractComponent{

    WebDriver driver;

    public CheckoutPage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[placeholder='Select Country']")
    WebElement country;

    @FindBy(css = ".ta-item:nth-of-type(2)")
    WebElement selectCountry;

    @FindBy(css = ".action__submit")
    WebElement submit;

    
    By result = By.cssSelector(".ta-results");

    public void selectCountry(String countryName)
    {
        Actions a = new Actions(driver);
        a.sendKeys(country, countryName).build().perform();

        waitForElementToAppear(By.cssSelector(".ta-results"));
        country.sendKeys(countryName);
        selectCountry.click();
        submit.click();
        
    }

    public ConfirmationPage submitOrder()
    {
        submit.click();
        return new ConfirmationPage(driver);
    }
   

}
