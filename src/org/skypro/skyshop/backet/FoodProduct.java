package org.skypro.skyshop.backet;

import org.skypro.skyshop.product.Product;

public class FoodProduct extends Product {

    public FoodProduct(String name, Integer price) {
        super(name, price);
    }
    @Override
    public Integer getPrice() {
        return Integer.valueOf(price);
    }

    private String price() {
        return price;
    }

    @Override
    public boolean isSpesial() {
        return false;
    }


}
