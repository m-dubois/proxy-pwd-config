package org.matt.tools;

public class CharacterEncoder {

    public static String convert(char a) {

        if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') || (a >= '0' && a <= '9')) {
            return String.valueOf(a);
        } else {
            String s = Integer.toHexString(a);
            return "%" + s;
        }
    }

    public static String convert(String string) {
        String output = "";
        for (char c : string.toCharArray()) {
            output += CharacterEncoder.convert(c);
        }
        return output;
    }
}
