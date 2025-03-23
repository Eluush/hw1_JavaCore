package org.skypro.skyshop.product;

import org.skypro.skyshop.all.Searchable;


public abstract class Product implements Searchable {
    private final String name;
    public String price;


    public Product(String name, Integer description) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Название продукта не может быть пустой строкой или раной нулю" +
                    "null");
        }
        this.name = name;
        this.price = price;
    }

    public Product(String apple, int i, String price) {
        this.price = price;
        name = "";
    }


    public String getName() {
        return name;
    }


    public abstract Integer getPrice();

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




