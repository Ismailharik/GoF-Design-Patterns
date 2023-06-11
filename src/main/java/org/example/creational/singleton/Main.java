package org.example.creational.singleton;

public class Main {
    public static void main(String[] args) {

        /*
         * To achieve Singleton Design Pattern:
         * 1. make default constructor private to eliminate the instantiation.
         * 2. create a method (getInstance) that will return the same object to all classes that want to instantiate the Singleton class
         *
         * */
        System.out.println("====== LAZY SINGLETON ======");
        testLazySingleton();
        System.out.println();
        System.out.println("====== EAGER SINGLETON ======");
        testEagerSingleton();
        System.out.println();
        System.out.println("====== THREAD SAFE SINGLETON ======");
        testThreadSafeSingleton();

    }

    private static void testEagerSingleton() {
        EagerSingleton inst1 = EagerSingleton.getInstance();
        EagerSingleton inst2 = EagerSingleton.getInstance();
        // printing the hashcode of both instances to make sure it's the same object shared between all instances
        System.out.println("\ninstance 1 hashcode " + inst1.hashCode());
        inst1.printData();
        System.out.println("instance 2 hashcode " + inst2.hashCode());
        inst2.printData();
    }

    private static void testLazySingleton() {
        LazySingleton inst1 = LazySingleton.getInstance();
        LazySingleton inst2 = LazySingleton.getInstance();
        // printing the hashcode of both instances to make sure it's the same object shared between all instances
        System.out.println("\ninstance 1 hashcode " + inst1.hashCode());
        inst1.printData();
        System.out.println("instance 2 hashcode " + inst2.hashCode());
        inst2.printData();
    }

    private static void testThreadSafeSingleton() {
        new DataPrinter().start();
        new DataPrinter().start();

    }

}

class DataPrinter extends Thread {
    @Override
    public void run() {
        ThreadSafeSingleton.getInstance().printData();
    }
}