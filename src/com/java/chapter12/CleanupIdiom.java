package com.java.chapter12;

/**
 * Created by weijie on 17-7-24.
 */
class NeedsCleanup {
    // Constructor can't fail
    private static long counter = 1;
    private final long id = counter++;
    public void dispose() {
        System.out.println("NeedsCleanup " + id + " disposed");
    }
}

class ContructionException extends Exception {}

class NeedsCleanup2 extends NeedsCleanup {
    // Constructor can fail
    public NeedsCleanup2() throws ContructionException {}
}

public class CleanupIdiom {
    public static void main(String[] args) {
        NeedsCleanup nc1 = new NeedsCleanup();
        try {
            // ...
        } finally {
            nc1.dispose();
        }

        NeedsCleanup nc2 = new NeedsCleanup();
        NeedsCleanup nc3 = new NeedsCleanup();
        try {
            // ...
        } finally {
            nc3.dispose();
            nc2.dispose();
        }

        // If construction can fail you must guard each one:
        try {
            NeedsCleanup2 nc4 = new NeedsCleanup2();
            try {
                NeedsCleanup2 nc5 = new NeedsCleanup2();
                try {
                    // ...
                } finally {
                    nc5.dispose();
                }
            } catch (ContructionException e) {
                // nc5 constructor
                System.out.println(e);
            } finally {
                nc4.dispose();
            }
        } catch (ContructionException e) {
            // nc4 constructor
            System.out.println(e);
        }
    }
}
