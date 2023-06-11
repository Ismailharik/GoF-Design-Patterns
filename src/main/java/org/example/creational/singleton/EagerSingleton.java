package org.example.creational.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EagerSingleton {


    private List<Integer> data = Arrays.asList(1, 2, 3, 4);

    private static EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return instance;
    }

    // using private with the constructor to eliminate the instantiation of EagerSingleton
    private EagerSingleton() {
        Collections.shuffle(data);
    }

    public void printData() {
        System.out.print("Printing Data ==>");
        data.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();
    }

}
