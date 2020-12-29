package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {
    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement blueRadioBtn = driver.findElement(By.cssSelector("blue"));
        WebElement redRadioBtn = driver.findElement(By.cssSelector("red"));

        System.out.println("blueRadioBtn.isSelected() = " + blueRadioBtn.isSelected());
        System.out.println("redRadioBtn.isSelected() = " + redRadioBtn.isSelected());

        Assert.assertTrue(blueRadioBtn.isSelected(), "verify that blue is selected");
        Assert.assertTrue(redRadioBtn.isSelected(),"verify that red id not selected");


        Thread.sleep(5000);
        driver.quit();

    }
}
