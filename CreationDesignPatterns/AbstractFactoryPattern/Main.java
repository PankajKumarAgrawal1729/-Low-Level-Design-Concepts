package CreationDesignPatterns.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        AbstractFactoryProducer abstractFactoryProducer = new AbstractFactoryProducer();
        AbstractFactory abstractCarFactory = abstractFactoryProducer.getFactoryInstance("Luxury");
        Car economicCar = abstractCarFactory.getInstance(3000000);
        System.out.println(economicCar.getTopSpeed());
    }
}
