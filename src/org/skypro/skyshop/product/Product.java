package org.skypro.skyshop.product;

import org.skypro.skyshop.all.Searchable;


public abstract class Product implements Searchable {
    public final String name;
    private int price;

    public Product(String name, String priceStr) {
        this.name = name;
        try {
            this.price = Integer.parseInt(priceStr);
        } catch (NumberFormatException e) {
            this.price = 0;
        }
    }

    public int getPrice() {
        return price;
    }


    public Product(String apple, int i, int price) {
        this.price = price;
        name = "";
    }


    public String getName() {
        return name;
    }


    public abstract boolean isSpesial();


    @Override
    public String getSearchTerm() {
        return name;
    }

    @Override
    public String getContentType() {
        return "PRODUCT";
    }

    @Override
    public String toString() {
        return name;
    }


}



