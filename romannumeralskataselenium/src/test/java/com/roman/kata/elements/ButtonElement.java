package com.roman.kata.elements;

import org.openqa.selenium.WebDriver;

public class ButtonElement extends AbstractElement {

    public ButtonElement(WebDriver driver, String id) {
        super(driver, id);
    }

    public void click() {
        element().click();
    }

}
