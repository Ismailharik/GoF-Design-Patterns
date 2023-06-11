package org.example.creational.factoryMethodPattern.problem;

import org.example.creational.factoryMethodPattern.ChefsKnife;
import org.example.creational.factoryMethodPattern.Knife;
import org.example.creational.factoryMethodPattern.SteakKnife;

public class problemSet {
    Knife knife;
    //create knife object - concrete instantiation

    Knife orderKnife(String knifeType){
        //create Knife object - concrete instantiation
        if (knifeType.equals("steak")){
            knife = new SteakKnife();
        }else if (knifeType.equals("chefs")){
            knife = new ChefsKnife();
        }
        //prepare the knife
        knife.polish();
        knife.sharpen();
        return knife;
    }

    /*
    * Imagine that your store adds more and more knife types as its sales improve.
    * New sub-classes are added as needed.
    * the list of conditionals grows and grows as new knifes types are added.
    * */
}
