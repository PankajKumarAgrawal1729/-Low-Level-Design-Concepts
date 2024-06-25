package DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        BasePizza margherita = new Margherita();

        System.out.println("Simple margherita pizza price: " + margherita.cost());

        ToppingDecorator cheeseTopping = new ExtraCheese(margherita);
        System.out.println("Margherita pizza price with Extra Cheese: " + cheeseTopping.cost());

        ToppingDecorator mashroom = new Mushroom(cheeseTopping);
        System.out.println("Margherita pizza price with Extra Cheese + Mashroom: " + mashroom.cost());

    }
}
