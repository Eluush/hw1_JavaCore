package org.skypro.skyshop.product.ext;

import org.skypro.skyshop.product.Product;

public class Headphones extends Product {
    public Headphones(String name, String description) {
        super(name, description);
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public boolean isSpesial() {
        return false;
    }
}
