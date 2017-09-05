package com.roman.kata.elements;

import org.openqa.selenium.WebDriver;

public class DivElement extends AbstractElement{

    public DivElement(WebDriver driver, String id) {
        super(driver, id);
    }

    public String getText(){
        return element().getText();
    }

}
