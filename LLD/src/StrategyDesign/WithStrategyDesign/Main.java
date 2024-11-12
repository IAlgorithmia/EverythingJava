package StrategyDesign.WithStrategyDesign;

import StrategyDesign.WithStrategyDesign.Strategy.NormalDrive;

public class Main {
    public static void main(String[] args){
        Vehicle myVehicle1 = new OffRoadVehicle();
        Vehicle myVehicle2 = new GoodsVehicle();
        Vehicle myVehicle3 = new PassengerVehicle();
        myVehicle1.drive();
        myVehicle2.drive();
        myVehicle3.drive();
        Vehicle myVehicle4 = new Vehicle(new NormalDrive());
        //this is whats happening on the ground level
        myVehicle4.drive();
    }
}
