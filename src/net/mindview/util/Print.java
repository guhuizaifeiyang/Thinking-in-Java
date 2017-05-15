package net.mindview.util;

import java.io.PrintStream;

/**
 * Created by weijie on 17-5-15.
 */
public class Print {
    // Print with a newline
    public static void print(Object obj) {
        System.out.println(obj);
    }

    // Print a newline by itselt
    public static void print() {
        System.out.println();
    }

    // Print with no line break
    public static void printnb(Object obj) {
        System.out.println(obj);
    }

    // The new java SE5 printf()
    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
