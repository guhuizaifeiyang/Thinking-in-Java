package com.java.chapter9;

import java.util.Random;

/**
 * Created by weijie on 17-7-12.
 */
public interface RandVals {
    Random RAND = new Random(47);
    int RANDOM_INT = RAND.nextInt(10);
    long RANDOM_LONG = RAND.nextLong()*10;
}
