package Problem1.Factory.ProcessorPackage;

public class ArduinoMega implements Processor{
    private final String processorName;
    private final double price;

    public ArduinoMega() {
        processorName = "Arduino Mega";
        price = 5000;
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
