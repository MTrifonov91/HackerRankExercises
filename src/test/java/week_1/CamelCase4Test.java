package week_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_1.CamelCase4.transformString;

class CamelCase4Test {

    @ParameterizedTest
    @CsvSource({"S;M;plasticCup(), plastic cup",
            "C;V;mobile phone, mobilePhone",
            "C;C;coffee machine, CoffeeMachine",
            "S;C;LargeSoftwareBook, large software book",
            "C;M;white sheet of paper, whiteSheetOfPaper()",
            "S;V;pictureFrame, picture frame"})
    void testTransformString(String input, String expected) {
        String actual = transformString(input);
        assertEquals(expected, actual);
    }

}