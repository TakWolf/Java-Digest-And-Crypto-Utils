package com.takwolf.util.digest;

public class SHA512Util {

    private static DigestCoder coder = new DigestCoder("SHA-512");

    public final static String getDigest(byte[] input) {
        return coder.getDigest(input);
    }

    public final static String getDigest(String plainText) {
        return coder.getDigest(plainText);
    }

}
