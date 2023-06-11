package org.example.creational.factoryMethodPattern.solution2FactoryMethod;

import org.example.creational.factoryMethodPattern.Knife;

public class BudgetKnifeStore extends KnifeStore {

    //up to any subclass of KnifeStore to define this method
    @Override
    Knife createKnife(String knifeType) {

        if (knifeType.equals("steak")){
            return new BudgetSteakKnife();
        }else if (knifeType.equals("chefs")){
            return new BudgetChefsKnife();
        }
        //...
        else return null;
    }

    /*
    * All the subclasses of KnifeStore,like  QualityKnifeStore ... inherit the order method knife method
    * However each subclass define it's own create method
    *
    * Now instead of working with the factory object, we specialize or subclass the class that uses the factory method.
    * Each subclass must define its own factory method. We say that we are letting the sub-classes decide how
    *  objects are made. By separating the actual object creation from other behavior using factories,
    *  the code becomes cleaner to read and easier to maintain or change.
    * The client code is simplified and the details of object creation are moved into the factories.
    * The code becomes more extensible
    * */
}
