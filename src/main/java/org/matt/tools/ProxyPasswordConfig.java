package org.matt.tools;

public class ProxyPasswordConfig {

    public static void main(String[] args) {

        //abcdexyz0123456789&é"'(-è_çà)=$/\!~#{[|`\^@]}
        System.out.println(CharacterEncoder.convert(args[0]));
    }
}