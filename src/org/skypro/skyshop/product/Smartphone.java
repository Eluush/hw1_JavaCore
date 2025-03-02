package org.skypro.skyshop.product;

public class Smartphone extends Product{

    public Smartphone(String name, String description) {
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
