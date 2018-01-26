package org.matt.tools;

public class ProxyPasswordConfig {

    public static void main(String[] args) {

        //abcdexyz0123456789&é"'(-è_çà)=$/\!~#{[|`\^@]}

        if (args != null && args.length > 0) {
            System.out.println(CharacterEncoder.convert(args[0]));
        } else {
            System.out.println("Usage: java -jar proxy-pwd-config.jar myPasswordToEncodeWithSp3ci@lChars!");
        }
    }
}