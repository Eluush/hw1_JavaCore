package org.skypro.skyshop.product;

import org.skypro.skyshop.all.Searchable;

import java.util.Objects;



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



    public int getPrice () {return price;}




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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}



