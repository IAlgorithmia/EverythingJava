package StrategyDesign.WithStrategyDesign;

import StrategyDesign.WithStrategyDesign.Strategy.Drive;

public class Vehicle {
    Drive drivingObject;

    Vehicle(Drive drivingObject){
        this.drivingObject = drivingObject;
    }

    public void drive(){
        drivingObject.drive();
    }
}
