package BridgeDesignPattern.SolutionUsingBridgeDesignPattern.Implementor;

public class WaterBreatheImplementation implements BreatheImplementor {

    @Override
    public void breathe() {
        System.out.println("breathe through gills\n" +
                "absorb oxygen from water\n" +
                "inhale carbon Dioxide");
    }
}
