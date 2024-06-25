package BehavioralDesignPattern.StrategyDesignPattern.WithStrategyPattern;

import BehavioralDesignPattern.StrategyDesignPattern.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
