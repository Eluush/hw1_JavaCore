package org.skypro.skyshop.backet;

import org.skypro.skyshop.product.Product;

public class SimpleProduct extends Product {
    private int price;

    public SimpleProduct(String name, String description, int price) {
        super(name, description);
        if (price <= 0) {
            throw new IllegalArgumentException("Цена должна быть строго выше 0.");
        }
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


}

