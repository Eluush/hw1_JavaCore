package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    private static int FIXED_PRICE = 150;

    public FixPriceProduct(String name,String description) {
        super(name, Integer.valueOf(description));
    }

    @Override
    public Integer getPrice() {
        return Integer.valueOf(price);
    }

    @Override
    public boolean isSpesial() {
        return true;
    }

    @Override
    public String toString() {
        return getName() + ": фиксированная цена " + FIXED_PRICE;
    }
}
