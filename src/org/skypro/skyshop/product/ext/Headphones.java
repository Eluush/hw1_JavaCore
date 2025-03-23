package org.skypro.skyshop.product.ext;

import org.skypro.skyshop.product.Product;

public class Headphones extends Product {
    public Headphones(String name, String description) {
        super(name, Integer.valueOf(description));
    }

    @Override
    public Integer getPrice() {
        return Integer.valueOf(price);
    }

    @Override
    public boolean isSpesial() {
        return false;
    }
}
