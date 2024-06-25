package DecoratorDesignPattern;

public class ExtraCheese extends ToppingDecorator{
    BasePizza basePizza;

    ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost() + 10;
    }
}
