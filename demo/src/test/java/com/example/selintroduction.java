package com.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selintroduction {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com");
        System.out.println(driver.getTitle()); 
        driver.close();
        driver.quit();
    }
}
