package org.skypro.skyshop.backet;

import org.skypro.skyshop.product.Product;

public class NonFoodProduct extends Product {
    public NonFoodProduct(String name, Integer price) {
        super(name, price);
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
