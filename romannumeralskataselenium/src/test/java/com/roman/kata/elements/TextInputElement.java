package com.roman.kata.elements;

import org.openqa.selenium.WebDriver;

public class TextInputElement extends AbstractElement {

    public TextInputElement(WebDriver driver, String id) {
        super(driver, id);
    }

    public void inputValue(String value) {
        element().sendKeys(value);
    }

}
