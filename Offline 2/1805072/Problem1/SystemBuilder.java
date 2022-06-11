package Problem1;

import Problem1.CommunicationPackage.CommunicationSystemFactory;
import Problem1.QueueSystemPackage.QueueManagementBuilder;
import Problem1.QueueSystemPackage.SystemList;

public class SystemBuilder {
    SystemList systemList = new SystemList();

    public SystemList buildSystem(String choice, String communication, String communicationDevice, int units){

        QueueManagementBuilder qmBuilder = new QueueManagementBuilder();
        if(choice.equalsIgnoreCase("Deluxe")){
           systemList.addItem(qmBuilder.buildDeluxe());
        }else if(choice.equalsIgnoreCase("Optimal")){
            systemList.addItem(qmBuilder.buildOptimal());
        }else if(choice.equalsIgnoreCase("Poor")){
            systemList.addItem(qmBuilder.buildPoor());
        }

        Application application = new Application();
        systemList.addItem(application);

        CommunicationSystemFactory csFactory = new CommunicationSystemFactory();
        if(communication.equalsIgnoreCase("Wifi")){
            if(communicationDevice.equalsIgnoreCase("Mazeda")){
                systemList.addItem(csFactory.getMazedaService());
            }else if(communicationDevice.equalsIgnoreCase("Dot")){
                systemList.addItem(csFactory.getDotService());
            }else if(communicationDevice.equalsIgnoreCase("Xplore")){
                systemList.addItem(csFactory.getXploreService());
            }
        }
        else if(communication.equalsIgnoreCase("Mobile Data")){
            if(communicationDevice.equalsIgnoreCase("Airtel")){
                systemList.addItem(csFactory.getAirtelSIM());
            }else if(communicationDevice.equalsIgnoreCase("Teletalk")){
                systemList.addItem(csFactory.getTeletalkSIM());
            }else if(communicationDevice.equalsIgnoreCase("Banglalink")){
                systemList.addItem(csFactory.getBanglalinkSIM());
            }
        }

        ControlUnit controlUnit = new ControlUnit();
        systemList.addItem(controlUnit);

        systemList.setUnits(units);

        return systemList;
    }
}
