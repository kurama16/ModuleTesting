package org.pkg.appglobals;

public class ApplicationConstants {
    public static final String APP_NAME = "module test";
    private static int counter;

    public static int getCounter() {
        return counter;
    }

    public static void addCounter() {
        ApplicationConstants.counter +=1;
    }
}
