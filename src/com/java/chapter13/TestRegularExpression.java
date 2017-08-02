package com.java.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by weijie on 17-8-2.
 */
public class TestRegularExpression {
    public static void main(String[] args) {
        String[] regulars = new String[]{"abcabcabcdefabc", "abc+", "(abc)+", "(abc){2,}", "(abc){2}"};
        for (String arg : regulars) {
            System.out.println("Regular expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(regulars[0]);
            while(m.find()) {
                System.out.println("Match \"" + m.group() + "\" at positions " +
                        m.start() + "-" + (m.end() - 1));
            }
        }
    }
}
