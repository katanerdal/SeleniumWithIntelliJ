package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.get("https://www.google.com/search?q=react+developer+tools&rlz=1C1SQJL_enNG916NG916&oq=&aqs=chrome.0.35i39i362l8...8.2698908j0j7&sourceid=chrome&ie=UTF-8");
    }
}
