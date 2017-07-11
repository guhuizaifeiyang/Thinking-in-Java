package com.java.chapter9;

/**
 * Created by weijie on 17-7-11.
 */
class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}

class Upcase extends Processor {
    @Override
    String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase extends Processor {
    @Override
    String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "Disagreement with beliefs";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
    }
}
