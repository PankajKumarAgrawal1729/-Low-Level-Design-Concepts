package ApplyCouponOnShoppingCartProducts;

public abstract class Product {
    String name;
    double originalPrice;
    ProductType type;
    public Product() {
    }
    public Product(String name, double originalPrice, ProductType type) {
        this.name = name;
        this.originalPrice = originalPrice;
        this.type = type;
    }

    public abstract double getPrice();

    public ProductType getType(){
        return type;
    }
}
