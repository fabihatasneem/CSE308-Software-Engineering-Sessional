package Problem1.CommunicationPackage;

import Problem1.CommunicationPackage.MobileDataService.*;
import Problem1.CommunicationPackage.BroadbandService.*;

public class CommunicationSystemFactory {

    public SIMCard getAirtelSIM(){
        return new Airtel();
    }

    public SIMCard getBanglalinkSIM(){
        return new Banglalink();
    }

    public SIMCard getTeletalkSIM(){
        return new Teletalk();
    }

    public WifiModule getMazedaService(){
        return new Mazeda();
    }

    public WifiModule getDotService(){
        return new Dot();
    }

    public WifiModule getXploreService(){
        return new Xplore();
    }
}
