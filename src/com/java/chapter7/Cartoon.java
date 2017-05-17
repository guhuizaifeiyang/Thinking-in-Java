package com.java.chapter7;

import static net.mindview.util.Print.*;

/**
 * Created by weijie on 17-5-17.
 */
class Art {
    Art() {
        print("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        print("Drawing constructor");
    }
}

public class Cartoon extends Drawing {
    Cartoon() {
        print("Cartoon construcotr");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }

}
