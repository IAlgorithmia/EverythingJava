package StrategyDesign.WithStrategyDesign;

import StrategyDesign.WithStrategyDesign.Strategy.SpecialType1;

public class SportsVehicle extends Vehicle{
    SportsVehicle(){
        super(new SpecialType1());
    }
}
