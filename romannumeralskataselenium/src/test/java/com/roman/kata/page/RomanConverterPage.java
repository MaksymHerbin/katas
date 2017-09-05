package com.roman.kata.page;

import com.roman.kata.elements.ButtonElement;
import com.roman.kata.elements.DivElement;
import com.roman.kata.elements.TextInputElement;
import org.openqa.selenium.WebDriver;

public class RomanConverterPage {

    private WebDriver driver;
    private TextInputElement romanNumeralsInput;
    private ButtonElement convertButton;
    private DivElement result;

    public RomanConverterPage(WebDriver driver){
        this.driver = driver;
        this.romanNumeralsInput = new TextInputElement(driver, "romanNumeralInput");
        this.convertButton = new ButtonElement(driver, "convertButton");
        this.result = new DivElement(driver, "result");
    }

    public void open(){
        String filePath = this.getClass().getResource("/index.html").getPath();
        driver.get("file:///"+filePath);
    }

    public ButtonElement convertButton(){
        return convertButton;
    }

    public TextInputElement romanNumeralInput(){
        return romanNumeralsInput;
    }

    public DivElement result(){
        return result;
    }


}
