package com.java.chapter11;

import java.util.ArrayList;

/**
 * Created by weijie on 17-7-14.
 */
public class ApplesAndOrangesWithoutGenerics2 {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        // Compile-time error:
//        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).id());
        }
        for (Apple c : apples) {
            System.out.println(c.id());
        }
    }
}
