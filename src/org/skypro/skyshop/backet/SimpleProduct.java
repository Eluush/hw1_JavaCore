package org.skypro.skyshop.backet;

import org.skypro.skyshop.product.Product;

public class SimpleProduct extends Product {
    private int price;

    public SimpleProduct(String name, Integer description, int price) {
        super(name, description);
        if (price <= 0) {
            throw new IllegalArgumentException("Цена должна быть строго выше 0.");
        }
        this.price = price;
    }

    @Override
    public Integer getPrice() {
        return Integer.valueOf(String.valueOf(0));
    }

    @Override
    public boolean isSpesial() {
        return false;
    }

    @Override
    public String toString() {
        return getName() + ": " + getPrice();

    }


}

