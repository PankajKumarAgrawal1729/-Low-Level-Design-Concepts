package BehavioralDesignPattern.StrategyDesignPattern.WithStrategyPattern;

import BehavioralDesignPattern.StrategyDesignPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
