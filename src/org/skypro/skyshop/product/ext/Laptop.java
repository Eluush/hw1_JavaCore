package org.skypro.skyshop.product.ext;

import org.skypro.skyshop.product.Product;

public class Laptop extends Product {
    @Override
    public Integer getPrice() {
        return Integer.valueOf(price);
    }

    @Override
    public boolean isSpesial() {
        return false;
    }

    public Laptop(String name, String description) {
        super(name, Integer.valueOf(description));
    }
}
