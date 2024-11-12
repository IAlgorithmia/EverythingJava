package StrategyDesign.WithStrategyDesign.Strategy;

public class NormalDrive implements Drive{
    @Override
    public void drive(){
        System.out.println("Standard Drive Capability");
    }
}
