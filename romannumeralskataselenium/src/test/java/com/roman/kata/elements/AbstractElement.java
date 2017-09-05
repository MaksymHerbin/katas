package com.roman.kata.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class AbstractElement {

    private WebDriver driver;
    private String id;

    AbstractElement(WebDriver driver, String id) {
        this.driver = driver;
        this.id = id;
    }

    WebElement element() {
        return driver.findElement(By.id(id));
    }


}
