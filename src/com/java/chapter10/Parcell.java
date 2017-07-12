package com.java.chapter10;

/**
 * Created by weijie on 17-7-12.
 */
public class Parcell {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    // Using inner classes looks just like
    // using any other class, within Parcell:
    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcell p = new Parcell();
        p.ship("Tasmania");
    }
}
