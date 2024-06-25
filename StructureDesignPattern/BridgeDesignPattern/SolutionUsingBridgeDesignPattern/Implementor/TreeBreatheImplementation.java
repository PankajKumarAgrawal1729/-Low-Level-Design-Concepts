package BridgeDesignPattern.SolutionUsingBridgeDesignPattern.Implementor;

public class TreeBreatheImplementation implements BreatheImplementor {

    @Override
    public void breathe() {
        System.out.println("Breathe through Leaves\n" +
                "inhale carbon dioxide\n" +
                "exhale oxygen through photosynthesis");
    }
}
