package com.roman.kata.page;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class WebDriverTest {

    protected WebDriver driver;

    @BeforeClass
    public static void setUpTests() {
        System.setProperty("webdriver.chrome.driver", "C:\\Dev\\devtools\\chromedriver.exe");
    }

    @Before
    public void setUpDriver() {
        this.driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
