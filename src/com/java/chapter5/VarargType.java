package com.java.chapter5;

/**
 * Created by weijie on 17-5-15.
 */
public class VarargType {
    static void f(Character... args) {
        System.out.println(args.getClass()+" length "+args.length);
    }
    static void g(int... args) {
        System.out.println(args.getClass()+" length "+args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
        System.out.println("int[]: "+new int[0].getClass());
    }
}
