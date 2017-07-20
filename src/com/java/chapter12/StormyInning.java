package com.java.chapter12;

/**
 * Created by weijie on 17-7-20.
 */
class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning {
    public Inning() throws BaseballException {}
    public void event() throws BaseballException {}
    public abstract void atBat() throws Strike, Foul;
    public void walk() {}
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm{
    // OK to add new exception for constructors, but you
    // must deal with the base constructor exceptions:
    public StormyInning() throws RainedOut, BaseballException {}

    public StormyInning(String s) throws Foul, BaseballException {}

    // Regular methods must conform to base class:
//    public void walk() throws PopFoul {} // Compile error

    // Interface CANNOT add exceptions to existing
    // methods from the base class:
//    public void event() throws RainedOut {}

    // If the method doesn't already exist in the
    // base class, the exception is OK:
    @Override
    public void rainHard() throws RainedOut {}

    // You can choose to not throw any exception,
    // even if the base version does:
    public void event() {}

    // Overridden methods can throw inherited exceptions:
    public void atBat() throws PopFoul {}

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop Foul");
        } catch (RainedOut rainedOut) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }

        // Strike not thrown in derived version.
        try {
            // What happens if you upcast?
            Inning i = new StormyInning();
            i.atBat();
            // You must catch the exception from the
            // base-class version of the method:
        } catch (Strike strike) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (BaseballException e) {
            e.printStackTrace();
        } catch (RainedOut rainedOut) {
            rainedOut.printStackTrace();
        }
    }
}
