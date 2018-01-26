package org.matt.tools;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharacterEncoderTest {

    @Test
    public void testConvertA() {
        String c = CharacterEncoder.convert('A');
        assertEquals("A", c);
    }

    @Test
    public void testConvertAtoZUpperCase() {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (char inputChar : s.toCharArray()) {
            String convertedChar = CharacterEncoder.convert(inputChar);
            assertEquals(String.valueOf(inputChar), convertedChar);
        }
    }

    @Test
    public void testConvertAtoZLowerCase() {
        String s = "abcdefghijklmnopqrstuvwxyz";
        for (char inputChar : s.toCharArray()) {
            String convertedChar = CharacterEncoder.convert(inputChar);
            assertEquals(String.valueOf(inputChar), convertedChar);
        }
    }

    @Test
    public void testConvertNumbers() {
        String s = "0123456789";
        for (char inputChar : s.toCharArray()) {
            String convertedChar = CharacterEncoder.convert(inputChar);
            assertEquals(String.valueOf(inputChar), convertedChar);
        }
    }

    @Test
    public void testConvertSharp() {
        String c = CharacterEncoder.convert('#');
        assertEquals("%23", c);
    }

    @Test
    public void testConvertAt() {
        String c = CharacterEncoder.convert('@');
        assertEquals("%40", c);
    }

    @Test
    public void testConvertStringABC() {
        assertEquals("abc", CharacterEncoder.convert("abc"));
    }

    @Test
    public void testConvertStringAsharpBAtC() {
        assertEquals("a%23b%40c", CharacterEncoder.convert("a#b@c"));
    }

}