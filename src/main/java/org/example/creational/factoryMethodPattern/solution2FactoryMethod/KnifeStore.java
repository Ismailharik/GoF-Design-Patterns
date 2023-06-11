package org.example.creational.factoryMethodPattern.solution2FactoryMethod;

import org.example.creational.factoryMethodPattern.Knife;


//this time KnifeFactory abstract, it should be defined by the sub-classes
public abstract class KnifeStore {
//    private final KnifeFactory factory;
    //require a KnifeFactory object to be passed to this constructor
//    public KnifeStore(KnifeFactory knifeFactory){
//        factory = knifeFactory;
//    }
    public Knife orderKnife(String knifeType){
        Knife knife;

        //now the Knife Store should be defined by the sub-classes
//        knife = factory.createKnife(knifeType);
        knife = createKnife(knifeType);
        //prepare the knife
        knife.polish();
        knife.sharpen();
        return knife;
    }
    // create method will be defined by the sub-classes
    abstract Knife createKnife(String knifeType);

}
