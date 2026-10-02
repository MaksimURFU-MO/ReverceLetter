import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoPointerTest {
    TwoPointer twoPointer = new TwoPointer();

    @Test
    void defaultString(){
        String result = twoPointer.Reverse2("J@va the be$t!123");
        assertEquals("t@eb eht av$J!123",result);
    }

    @Test
    void returnsEmptyForEmptyInput(){
        String result = twoPointer.Reverse2("");
        assertEquals("",result);
    }

    @Test
    void oneLetter(){
        String result = twoPointer.Reverse2("a");
        assertEquals("a",result);
    }

    @Test
    void stringWithoutLetters(){
        String result = twoPointer.Reverse2("123 !@#");
        assertEquals("123 !@#",result);
    }

    @Test
    void onlyLetters(){
        String result = twoPointer.Reverse2("abcd");
        assertEquals("dcba",result);
    }
    @Test
    void notLettersSymbolByEdgeAndMiddle() {
        String result = twoPointer.Reverse2("1abcd()klmno~");
        assertEquals("1onml()kdcba~", result);
    }
    @Test
    void differentCase(){
        String result = twoPointer.Reverse2("AbRacaDaBra");
        assertEquals("arBaDacaRbA",result);
    }

    @Test
    void StringEqualsNull(){
        String result = twoPointer.Reverse2(null);
        assertEquals("Строка не может быть равна null", result);
    }

}