package Problem1.CommunicationPackage;

import Problem1.QueueSystemPackage.Item;

public abstract class Communication extends CommunicationSystemFactory implements Item{
    public abstract double getYearlyCommunicationCost();
}
