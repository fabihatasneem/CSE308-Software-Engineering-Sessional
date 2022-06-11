package Problem1.QueueSystemPackage;

import Problem1.Factory.DisplayPackage.Display;
import Problem1.Factory.FactoryCreator;
import Problem1.Factory.ProcessorPackage.Processor;
import Problem1.Factory.UnitFactory;

class Poor extends Choice{
    private Processor processor;
    private Display display;
    private double price;
    private UnitFactory displayFactory = FactoryCreator.getFactory("Display");
    private UnitFactory processorFactory = FactoryCreator.getFactory("Processor");

    public Poor() {
        this.processor = processorFactory.getProcessor("ATMega32");
        this.display = displayFactory.getDisplay("LED Matrix");
        this.price = processor.getProcessorPrice() + display.getDisplayPrice();
    }

    @Override
    public String getItemName() {
        return "POOR Package --> " +
                "Processor: " + processor.getProcessorName() + "(Price: " + processor.getProcessorPrice()
                + "), Display: " + display.getDisplayName() + "(Price: " + display.getDisplayPrice() + ")";
    }

    @Override
    public double getItemPrice() {
        return price;
    }
}
