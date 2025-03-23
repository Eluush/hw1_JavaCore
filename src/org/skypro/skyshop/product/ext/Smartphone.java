package org.skypro.skyshop.product.ext;

import org.skypro.skyshop.product.Product;

public class Smartphone extends Product {

    public Smartphone(String name, Integer description) {
        super(name, description);
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
