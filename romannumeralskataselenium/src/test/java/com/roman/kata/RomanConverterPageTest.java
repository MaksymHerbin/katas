package com.roman.kata;


import com.roman.kata.page.RomanConverterPage;
import com.roman.kata.page.WebDriverTest;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanConverterPageTest extends WebDriverTest {

    private RomanConverterPage page;

    @Before
    public void setUp() {
        page = new RomanConverterPage(driver);
        page.open();
    }

    @Test
    public void convertsI() {
        page.romanNumeralInput().inputValue("I");
        page.convertButton().click();
        assertThat(page.result().getText()).isEqualTo("1");
    }

    @Test
    public void convertsV() {
        page.romanNumeralInput().inputValue("V");
        page.convertButton().click();
        assertThat(page.result().getText()).isEqualTo("5");
    }

    @Test
    public void convertsX() {
        page.romanNumeralInput().inputValue("X");
        page.convertButton().click();
        assertThat(page.result().getText()).isEqualTo("10");
    }

    @Test
    public void convertsL() {
        page.romanNumeralInput().inputValue("L");
        page.convertButton().click();
        assertThat(page.result().getText()).isEqualTo("50");
    }

    @Test
    public void convertsC() {
        page.romanNumeralInput().inputValue("C");
        page.convertButton().click();
        assertThat(page.result().getText()).isEqualTo("100");
    }

    @Test
    public void convertsD() {
        page.romanNumeralInput().inputValue("D");
        page.convertButton().click();
        assertThat(page.result().getText()).isEqualTo("500");
    }

    @Test
    public void convertsM() {
        page.romanNumeralInput().inputValue("M");
        page.convertButton().click();
        assertThat(page.result().getText()).isEqualTo("1000");
    }

    @Test
    public void convertsWithAdditiveApproachOnly() {
        page.romanNumeralInput().inputValue("MMVI");
        page.convertButton().click();
        assertThat(page.result().getText()).isEqualTo("2006");
    }

    @Test
    public void convertsWithSubtractiveApproach() {
        page.romanNumeralInput().inputValue("MCMXLIV");
        page.convertButton().click();
        assertThat(page.result().getText()).isEqualTo("1944");
    }

}
