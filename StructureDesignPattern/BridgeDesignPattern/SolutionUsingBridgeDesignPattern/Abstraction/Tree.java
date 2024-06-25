package BridgeDesignPattern.SolutionUsingBridgeDesignPattern.Abstraction;

import BridgeDesignPattern.SolutionUsingBridgeDesignPattern.Implementor.BreatheImplementor;

public class Tree extends LivingThings {

    public Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}
