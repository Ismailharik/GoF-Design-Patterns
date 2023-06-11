package org.example.creational.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LazySingleton {

    private List<Integer> data = Arrays.asList(1,2,3,4);

    private static LazySingleton instance;
    public static LazySingleton getInstance(){
        if (instance==null){
             instance=new LazySingleton();
        }
        return instance;
    }

    // using private with the constructor to eliminate the instantiation of LazySingleton
    private LazySingleton(){
        Collections.shuffle(data);
    }

    public void printData(){
        System.out.print("Printing Data ==>");
        data.stream().forEach(s -> System.out.print(s+" "));
        System.out.println();
    }

}
