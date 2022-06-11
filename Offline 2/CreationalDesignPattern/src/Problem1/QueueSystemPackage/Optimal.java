package Problem1.QueueSystemPackage;

import Problem1.Factory.DisplayPackage.Display;
import Problem1.Factory.DisplayPackage.DisplayFactory;
import Problem1.Factory.ProcessorPackage.Processor;
import Problem1.Factory.ProcessorPackage.ProcessorFactory;

class Optimal extends Choice{
    private Processor processor;
    private Display display;
    private double price;

    public Optimal() {
        this.processor = new ProcessorFactory().getProcessor("Arduino Mega");
        this.display = new DisplayFactory().getDisplay("LED Matrix");
        this.price = processor.getProcessorPrice() + display.getDisplayPrice();
    }

    @Override
    public String getItemName() {
        return "OPTIMAL Package -->" +
            "Processor: " + processor.getProcessorName() + "(Price: " + processor.getProcessorPrice()
                + "), Display: " + display.getDisplayName() + "(Price: " + display.getDisplayPrice() + ")";
    }

    @Override
    public double getItemPrice() {
        return price;
    }
}
