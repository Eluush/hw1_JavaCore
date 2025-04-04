package org.skypro.skyshop.backet;

import org.skypro.skyshop.product.Product;

public class FoodProduct extends Product {

    @Override
    public boolean isSpesial() {
        return false;
    }

    public FoodProduct(String name, String price) {
        super(name, price);
    }
}
