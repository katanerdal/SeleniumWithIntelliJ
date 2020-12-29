package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullNameInput = driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Erdal Katan");

        WebElement emailID = driver.findElement(By.name("email"));
        emailID.sendKeys("katanerdal1907@gmail.com");

        WebElement wooden_spoon = driver.findElement(By.name("wooden_spoon"));
        wooden_spoon.click();

        WebElement iconHome = driver.findElement(By.className("icon-2x"));
        iconHome.click();

    }
}
