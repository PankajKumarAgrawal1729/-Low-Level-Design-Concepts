package BridgeDesignPattern.SolutionUsingBridgeDesignPattern.Abstraction;

import BridgeDesignPattern.SolutionUsingBridgeDesignPattern.Implementor.BreatheImplementor;

public abstract class LivingThings {
    BreatheImplementor breatheImplementor;
    public LivingThings(BreatheImplementor breatheImplementor){
        this.breatheImplementor = breatheImplementor;
    }
    public abstract void breatheProcess();
}
