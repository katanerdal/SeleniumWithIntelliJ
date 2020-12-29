package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(8000);
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.navigate().to("https://learn.cybertekschool.com/courses/499/pages/recording-session-with-mike-%7C-12-slash-12-slash-2020?module_item_id=32085");
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.quit();




    }
}
