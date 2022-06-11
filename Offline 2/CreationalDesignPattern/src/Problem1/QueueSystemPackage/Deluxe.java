package Problem1.QueueSystemPackage;

import Problem1.Factory.DisplayPackage.Display;
import Problem1.Factory.FactoryCreator;
import Problem1.Factory.ProcessorPackage.*;
import Problem1.Factory.UnitFactory;

class Deluxe extends Choice{
    private Processor processor;
    private Display display;
    private double price;
    private UnitFactory displayFactory = FactoryCreator.getFactory("Display");
    private UnitFactory processorFactory = FactoryCreator.getFactory("Processor");

    public Deluxe() {
        this.processor = processorFactory.getProcessor("Raspberry Pi");
        this.display = displayFactory.getDisplay("LCD Panel");
        this.price = processor.getProcessorPrice() + display.getDisplayPrice();
    }

    @Override
    public String getItemName() {
        return "DELUXE Package --> " +
                "Processor: " + processor.getProcessorName() + "(Price: " + processor.getProcessorPrice()
                + "), Display: " + display.getDisplayName() + "(Price: " + display.getDisplayPrice() + ")";
    }

    @Override
    public double getItemPrice() {
        return price;
    }
}
