package com.java.day1;

/**
 * Created by weijie on 17-5-9.
 */
class Rock {
    Rock() {
        System.out.print("Rock ");
    }
}

class Rock2 {
    Rock2(int i) {
        System.out.print("Rock2 " + i + " ");
    }
}
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }

        System.out.println("===============");

        for (int i = 0; i < 8; i++) {
            new Rock2(i);
        }
    }
}
