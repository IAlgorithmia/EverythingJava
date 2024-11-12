package StrategyDesign.WithStrategyDesign;

import StrategyDesign.WithStrategyDesign.Strategy.SpecialType2;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle(){
        super (new SpecialType2());
    }
}
