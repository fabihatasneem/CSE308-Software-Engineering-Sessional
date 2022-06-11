package Problem1.Factory;

import Problem1.Factory.DisplayPackage.*;
import Problem1.Factory.ProcessorPackage.*;

public abstract class UnitFactory {
    public abstract Processor getProcessor(String processor);
    public abstract Display getDisplay(String display);
}
