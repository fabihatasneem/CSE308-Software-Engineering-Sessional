package Problem1.Factory.DisplayPackage;

import Problem1.Factory.UnitFactory;
import Problem1.Factory.ProcessorPackage.Processor;

public class DisplayFactory extends UnitFactory {
    @Override
    public Processor getProcessor(String processor) {
        return null;
    }

    @Override
    public Display getDisplay(String display){
        if(display == null) {
            return null;
        }else if(display.equalsIgnoreCase("LCD Panel")){
            return new LCDPanel();
        } else if(display.equalsIgnoreCase("LED Matrix")){
            return new LEDMatrix();
        }
        return null;
    }
}
