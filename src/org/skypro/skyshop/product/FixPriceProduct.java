package org.skypro.skyshop.product;

public class FixPriceProduct extends Product{
   private static int FIXED_PRICE = 150;
    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public int getPrice() {
        return FIXED_PRICE;
    }

    @Override
    public boolean isSpesial() {
        return true;
    }

    @Override
    public String toString() {
        return getName() + ": фиксированная цена " +FIXED_PRICE;
    }
}
