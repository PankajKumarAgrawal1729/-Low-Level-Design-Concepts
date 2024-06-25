package BridgeDesignPattern.SolutionUsingBridgeDesignPattern.Implementor;

public class LandBreatheImplementation implements BreatheImplementor {

    @Override
    public void breathe() {
        System.out.println("Breathe through Nose\n" +
                "Inhale oxygen from air\n" +
                "exhale carbon Dioxide");
    }

}
