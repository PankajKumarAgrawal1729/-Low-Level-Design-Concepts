package BehavioralDesignPattern.StrategyDesignPattern.WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        SportsVehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();

        GoodsVehicle goodsVehicle = new GoodsVehicle();
        goodsVehicle.drive();

        OffRoadVehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();
    }
}
