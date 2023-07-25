package com.study;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {
    
    public void doThis()
    {
        System.out.println("I am the best I love universe");
    }

    @BeforeMethod
    public void beforerun()
    {
        System.out.println("I am the First one");
    }

    @AfterMethod
    public void afterrun()
    {
        System.out.println("I am at the end");
    }
}

