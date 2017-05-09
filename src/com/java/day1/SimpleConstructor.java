package com.java.day1;

/**
 * Created by weijie on 17-5-9.
 */
class Rock {
    Rock() {
        System.out.println("Rock ");
    }
}
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}
