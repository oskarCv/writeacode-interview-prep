package net.writeacode.java.prep.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindNumberOfVowelsTest {
    private FindNumberOfVowels vowels;

    @BeforeEach
    public void setup(){
        vowels = new FindNumberOfVowels();
    }

    @Test
    public void getVowelsTest(){
        String str = "asdfeplkiyo";
        assertTrue(vowels.getVowels(str)==4);
    }
}
