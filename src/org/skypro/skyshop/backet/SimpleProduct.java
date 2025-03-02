package org.skypro.skyshop.backet;

import org.skypro.skyshop.product.Product;

public class SimpleProduct extends Product {
    private int price;

    public SimpleProduct(String name, int price) {
        super(name);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public boolean isSpesial() {
        return false;
    }

    @Override
    public String toString() {
        return getName() + ": " + getPrice();

    }

    @Override
    public boolean contains(String query) {
        return false;
    }
}

