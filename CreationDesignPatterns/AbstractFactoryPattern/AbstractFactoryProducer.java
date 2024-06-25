package CreationDesignPatterns.AbstractFactoryPattern;

public class AbstractFactoryProducer {
    public AbstractFactory getFactoryInstance(String value){
        if(value.equals("Economy")){
            return new EconomicCarFactory();
        }else if(value.equals("Luxury") || value.equals("Premium")){
            return new LuxuryCarFactory();
        }
        return null;
    }
}
