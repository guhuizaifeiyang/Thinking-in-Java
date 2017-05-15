package com.java.chapter5;

/**
 * Created by weijie on 17-5-15.
 */
class B {
}

public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object obj : args) {
            System.out.println(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{new Integer(47), new Float(3.14), new Double(11.11)});
        printArray(47, 3.14, 11.11);
        printArray(new Object[]{"one", "two", "three"});
        printArray(new Object[]{new B(), new B(), new B()});
        printArray(new Integer[]{1,2,3,4});
        printArray();
    }
}
