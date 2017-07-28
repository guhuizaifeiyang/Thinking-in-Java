package com.java.chapter13;

/**
 * Created by weijie on 17-7-28.
 */
public class Hex {
    public static String format(byte[] data) {
        StringBuilder result = new StringBuilder();
        int n = 0;
        for (byte b : data) {
            if (n % 16 == 0) {
                result.append(String.format("%05X: ", n));
            }
            result.append(String.format("%0xX: ", b));
            n++;
            if (n % 16 == 0) {
                result.append("\n");
            }
        }
        result.append("\n");
        return result.toString();
    }
    public static void main(String[] args) throws Exception{

    }
}
