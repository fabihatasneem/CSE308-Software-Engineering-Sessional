package Problem1.Factory.ProcessorPackage;

public class ATMega32 implements Processor{
    private final String processorName;
    private final double price;
    public ATMega32() {
        processorName = "ATMega32";
        price = 1000;
    }
    @Override
    public String getProcessorName() {
        return processorName;
    }

    @Override
    public double getProcessorPrice() {
        return price;
    }
}
