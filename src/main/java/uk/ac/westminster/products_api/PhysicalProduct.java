package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product{
    private double weightKg;
    private double dimensions;

    public PhysicalProduct(){};

    public PhysicalProduct(Long id, String name, double price, double weightKg, double dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public double getDimensions() {
        return dimensions;
    }
}
