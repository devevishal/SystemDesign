package org.design.designpattern.singleton;

public class Singleton {
    // The following code emulates slow initialization.
    private static Singleton instance = null;
    private String value;

    private Singleton(String value){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        Singleton singletonNonThreadSafe = instance;
        if (singletonNonThreadSafe != null)
            return singletonNonThreadSafe;
        synchronized (Singleton.class) {
            {
                if (instance == null) {
                    instance = new Singleton(value);
                }
                return instance;
            }
        }
    }

    public String getValue() {
        return value;
    }
}
