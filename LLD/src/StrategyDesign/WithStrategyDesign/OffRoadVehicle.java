package StrategyDesign.WithStrategyDesign;

import StrategyDesign.WithStrategyDesign.Strategy.SpecialType1;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super (new SpecialType1());
    }
}
