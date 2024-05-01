package org.design.designpattern.creational.singleton;

public class TestSingleton {

    public static void main(String[] args) {

        // test with thread safe

        Singleton singletonNonThreadSafe =
                Singleton.getInstance("FOO");
        System.out.println(singletonNonThreadSafe.getValue());

        Singleton singletonNonThreadSafe1 =
                Singleton.getInstance("BAR");
        System.out.println(singletonNonThreadSafe1.getValue());


       // test with threading

        Thread threadFoo = new Thread(new TheadFoo());

        Thread threadBar = new Thread(new TheadBar());

        threadFoo.start();
        threadBar.start();




    }

    static class TheadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singletonNonThreadSafe =
                    Singleton.getInstance("FOO");
            System.out.println(singletonNonThreadSafe.getValue());
        }
    }

    static class TheadBar implements Runnable {
        @Override
        public void run() {
            Singleton singletonNonThreadSafe =
                    Singleton.getInstance("BAR");
            System.out.println(singletonNonThreadSafe.getValue());
        }
    }



}
