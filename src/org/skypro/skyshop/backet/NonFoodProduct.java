package org.skypro.skyshop.backet;

import org.skypro.skyshop.product.Product;

public class NonFoodProduct extends Product {
    public NonFoodProduct(String name, String price) {
        super(name, price);
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
