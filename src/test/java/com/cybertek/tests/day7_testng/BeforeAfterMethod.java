package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
    @Test
    public void test1(){

        System.out.println("First Test Case");

    }
    @BeforeMethod
    public void setup(){
        System.out.println("WebDriving,Opening Browser");
    }

    @Test
    public void test3(){
        String expectedTitle = "Cyb";
        String actualTitle = "CyberTek";
        Assert.assertTrue(actualTitle.startsWith(expectedTitle), "Verify title startwith cyb");
    }

    @Test
    public  void test4(){
        String email = "erdal@katan.com";
        Assert.assertTrue(email.contains("@"),"verify email contain @");
    }

    @Test
    public  void test5(){
        Assert.assertFalse(0>5, "verify that 0 is not greater than 5");
    }


    @AfterMethod
    public void TearDown(){
        System.out.println("Closing Browser,Quit");
    }

}
