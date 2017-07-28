package com.java.chapter13;

/**
 * Created by weijie on 17-7-28.
 */
public class DatabaseException extends Exception{
    public DatabaseException(int tranactionID, int queryID, String message) {
        super(String.format("(t%d, q%d) %s", tranactionID, queryID, message));
    }

    public static void main(String[] args) {
        try {
            throw new DatabaseException(3, 7, "Write failed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
