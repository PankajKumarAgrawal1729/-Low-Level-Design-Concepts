package ApplyCouponOnShoppingCartProducts;

public class Main {
    public static void main(String[] args) {
        Product item1 = new Item1("Fan", 1000, ProductType.ELECTRONIC_GOODS);
        Product item2 = new Item2("Sofa", 2000, ProductType.FURNITURE_GOODS);

        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(item1);
        cart.addToCart(item2);
        System.out.println("Total amount after discount: " + cart.getTotalPrice());
    }
}
