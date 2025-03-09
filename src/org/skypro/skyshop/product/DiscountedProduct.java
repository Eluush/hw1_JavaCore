package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private int discountPercentage;
    private int basePrice;


    public DiscountedProduct(String name,String description, int basePrice, int discountPercentage) {
        super(name,description);
        this.basePrice = basePrice;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public int getPrice() {
        return basePrice * (100 - discountPercentage) / 100;
    }

    @Override
    public boolean isSpesial() {
        return true;
    }

    @Override
    public String toString() {
        return getName() + ": " + getPrice() + " (" + discountPercentage + "%)";
    }
}
