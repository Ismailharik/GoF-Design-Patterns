package org.example.creational.factoryMethodPattern.solution1FactoryObject;

import org.example.creational.factoryMethodPattern.Knife;

public class KnifeStore {
    private final KnifeFactory factory;
    //require a KnifeFactory object to be passed to this constructor
    public KnifeStore(KnifeFactory knifeFactory){
        factory = knifeFactory;
    }
    public Knife orderKnife(String knifeType){
        Knife knife;

        //use the create method in the factory
        knife = factory.createKnife(knifeType);
        //prepare the knife
        knife.polish();
        knife.sharpen();
        return knife;
    }

    /*
    * instead of performing concrete instantiation itself, it delegates this task to the factory object.
    *  What have you gained?
    *   --> First of all, the knifeStore and its orderKnife method may not be the only client of your knifeFactory.
    *   --> Other clients may use knifeFactories to create knifes for other purposes.
    *
    * Since all the actual knifes creation happens in the knifeFactory,
    * you can simply add new knife types to your knifeFactory without modifying the client code.
    *
    * This is called "Coding to an interface and not to an implementation"
    * */

    /*
    * This approach is called Factory Object Method , it's not one of GANGS of 4 Design Patterns
    * Although there is a useful technique Factory Method Patterns
    *
    * */


    /*
    * The factory method pattern approaches the creation of specific types of objects in a different way.
    *  Instead of using a separate object, a factory object to create the objects,
    *  the factory method uses a separate method in the same class to create the objects.
    * */
}
