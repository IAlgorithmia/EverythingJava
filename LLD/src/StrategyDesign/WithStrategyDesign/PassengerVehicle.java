package StrategyDesign.WithStrategyDesign;

import StrategyDesign.WithStrategyDesign.Strategy.NormalDrive;

public class PassengerVehicle extends Vehicle {
    PassengerVehicle(){
        super(new NormalDrive());
    }
}
