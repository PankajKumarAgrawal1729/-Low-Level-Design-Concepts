package BridgeDesignPattern.SolutionUsingBridgeDesignPattern;

import BridgeDesignPattern.SolutionUsingBridgeDesignPattern.Abstraction.Dog;
import BridgeDesignPattern.SolutionUsingBridgeDesignPattern.Abstraction.Fish;
import BridgeDesignPattern.SolutionUsingBridgeDesignPattern.Abstraction.LivingThings;
import BridgeDesignPattern.SolutionUsingBridgeDesignPattern.Abstraction.Tree;
import BridgeDesignPattern.SolutionUsingBridgeDesignPattern.Implementor.LandBreatheImplementation;
import BridgeDesignPattern.SolutionUsingBridgeDesignPattern.Implementor.TreeBreatheImplementation;
import BridgeDesignPattern.SolutionUsingBridgeDesignPattern.Implementor.WaterBreatheImplementation;

public class Main {
    public static void main(String[] args) {
        LivingThings tree = new Tree(new TreeBreatheImplementation());
        tree.breatheProcess();

        LivingThings dog = new Dog(new LandBreatheImplementation());
        dog.breatheProcess();

        LivingThings fish = new Fish(new WaterBreatheImplementation());
        fish.breatheProcess();
    }
}
