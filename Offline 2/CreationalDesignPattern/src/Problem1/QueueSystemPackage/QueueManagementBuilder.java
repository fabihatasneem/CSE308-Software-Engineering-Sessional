package Problem1.QueueSystemPackage;

public class QueueManagementBuilder {

    public Choice buildDeluxe(){
        return new Deluxe();
    }

    public Choice buildOptimal(){
        return new Optimal();
    }

    public Choice buildPoor(){
        return new Poor();
    }
}
