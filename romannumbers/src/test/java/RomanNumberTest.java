import com.herbinm.katas.RomanNumber;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumberTest {

    @Test
    public void convertsSingleCharacterRomanNumeral() {
        assertThat(new RomanNumber("I").toArabic()).isEqualTo(1);
        assertThat(new RomanNumber("V").toArabic()).isEqualTo(5);
        assertThat(new RomanNumber("X").toArabic()).isEqualTo(10);
        assertThat(new RomanNumber("L").toArabic()).isEqualTo(50);
        assertThat(new RomanNumber("C").toArabic()).isEqualTo(100);
        assertThat(new RomanNumber("D").toArabic()).isEqualTo(500);
        assertThat(new RomanNumber("M").toArabic()).isEqualTo(1000);
    }

    @Test
    public void addNumbersInDescendingOrder() {
        assertThat(new RomanNumber("VI").toArabic()).isEqualTo(6);
    }

    @Test
    public void subtractsNumbersInAscendingOrder(){
        assertThat(new RomanNumber("IV").toArabic()).isEqualTo(4);
    }

    @Test
    public void acceptanceTest(){
        assertThat(new RomanNumber("MCMXLIV").toArabic()).isEqualTo(1944);
    }

}
