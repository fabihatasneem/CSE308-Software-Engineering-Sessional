package Problem1.Factory;

import Problem1.Factory.DisplayPackage.DisplayFactory;
import Problem1.Factory.ProcessorPackage.ProcessorFactory;

public class FactoryCreator {
    public static UnitFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Display")){
            return new DisplayFactory();
        } else if(choice.equalsIgnoreCase("Processor")){
            return new ProcessorFactory();
        }
        return null;
    }
}
