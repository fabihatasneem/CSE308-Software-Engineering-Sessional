package Problem1.Factory.ProcessorPackage;

public class RaspberryPi implements Processor{
    private final String processorName;
    private final double price;
    public RaspberryPi() {
        processorName = "Raspberry Pi";
        price = 3000;
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
