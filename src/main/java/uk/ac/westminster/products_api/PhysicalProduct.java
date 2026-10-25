package uk.ac.westminster.products_api;
// A PhysicalProduct IS-A Product because it is still an item in the catalogue with an id, name and price, just one that is shipped.
// A ShoppingCart would NOT pass this test: a cart HAS products, it is not a kind of product (HAS-A, so use a field).

public class PhysicalProduct extends Product{
    private double weightKg;
    private String dimensions;

    public PhysicalProduct(){}

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
