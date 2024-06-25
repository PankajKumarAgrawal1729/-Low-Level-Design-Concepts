package BridgeDesignPattern.Problem;

public class Fish extends LivingThings {

    @Override
    public void breatheProcess() {
        System.out.println("breathe through gills\n" +
                "        absorb oxygen from water\n" +
                "        inhale carbon Dioxide");
    }
}
