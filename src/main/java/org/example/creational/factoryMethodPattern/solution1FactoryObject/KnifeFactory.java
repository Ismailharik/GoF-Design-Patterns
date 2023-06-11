package org.example.creational.factoryMethodPattern.solution1FactoryObject;

import org.example.creational.factoryMethodPattern.ChefsKnife;
import org.example.creational.factoryMethodPattern.Knife;
import org.example.creational.factoryMethodPattern.SteakKnife;

public class KnifeFactory {
    public Knife createKnife(String knifeType){
        Knife knife=null;


        if (knifeType.equals("steak")){
            knife = new SteakKnife();
        }else if (knifeType.equals("chefs")){
            knife = new ChefsKnife();
        }
        return knife;
    }

}
