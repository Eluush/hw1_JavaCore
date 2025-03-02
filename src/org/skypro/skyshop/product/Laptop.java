package org.skypro.skyshop.product;

public class Laptop extends Product{
    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public boolean isSpesial() {
        return false;
    }

    public Laptop(String name, String description) {
        super(name, description);
    }
}
