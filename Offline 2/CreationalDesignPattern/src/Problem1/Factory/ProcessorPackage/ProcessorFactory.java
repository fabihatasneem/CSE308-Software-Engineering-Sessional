package Problem1.Factory.ProcessorPackage;

import Problem1.Factory.DisplayPackage.Display;
import Problem1.Factory.UnitFactory;

public class ProcessorFactory extends UnitFactory {
    @Override
    public Processor getProcessor(String processor){
        if(processor == null) {
            return null;
        }else if(processor.equalsIgnoreCase("ATMega32")){
            return new ATMega32();
        } else if(processor.equalsIgnoreCase("Arduino Mega")){
            return new ArduinoMega();
        } else if(processor.equalsIgnoreCase("Raspberry Pi")){
            return new RaspberryPi();
        }
        return null;
    }

    @Override
    public Display getDisplay(String display) {
        return null;
    }

}
