package org.example.creational.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreadSafeSingleton {
    // List of integers
    private List<Integer> data = Arrays.asList(1, 2, 3, 4);
    // Singleton instance
    private static volatile ThreadSafeSingleton instance;

    public static ThreadSafeSingleton getInstance() {
        ThreadSafeSingleton result = instance; // Store the instance in a local variable
        if (result == null) { // Check if the instance is null
            synchronized (ThreadSafeSingleton.class) { // Synchronize to ensure thread safety
                result = instance; // Re-check the instance after acquiring the lock
                //why we should re-check it , suppose that we have two threads located on the first if (result == null)
                //the first one will enter and get new instance , but the second one still have result equal null,
                // for that we have to affect instance to result
                if (result == null) {
                    // If still null, create a new instance and assign it to the variable
                    instance = result = new ThreadSafeSingleton();
                }
            }
        }
        return result;
    }

    // Private constructor to prevent direct instantiation
    private ThreadSafeSingleton() {
        Collections.shuffle(data);
    }

    public synchronized void printData() {
        data.forEach(integer -> System.out.print(integer));
        System.out.println();
    }
}
