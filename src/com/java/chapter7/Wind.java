package com.java.chapter7;

/**
 * Created by weijie on 17-5-23.
 */
class Instrument {
    public void play() {
    }

    static void tune(Instrument i) {
        i.play();
    }
}

public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}
