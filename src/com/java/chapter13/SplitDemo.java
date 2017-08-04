package com.java.chapter13;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by weijie on 17-8-4.
 */
public class SplitDemo {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(input.split("!!")));
        // Only do the first three:
        System.out.println(Arrays.toString(input.split("!!", 3)));

    }
}
