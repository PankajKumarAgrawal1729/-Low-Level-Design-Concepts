package BehavioralDesignPattern.StrategyDesignPattern.WithStrategyPattern;

import BehavioralDesignPattern.StrategyDesignPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
