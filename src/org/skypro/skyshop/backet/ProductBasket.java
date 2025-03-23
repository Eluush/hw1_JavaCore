package org.skypro.skyshop.backet;

import org.skypro.skyshop.product.Product;

import java.util.*;

public class ProductBasket {
    private Map<String, List<Product>> productsMap;

    public ProductBasket() {
        productsMap = new HashMap<>();
    }

    public void addProduct(Product product) {
        productsMap.computeIfAbsent(product.getName(), k -> new ArrayList<>()).add(product);
    }

    public void removeProduct(Product product) {
        productsMap.remove(product);
    }

    public List<Product> getProductsByName(String name) {
        return productsMap.getOrDefault(name, new ArrayList<>());
    }

    public int getTotalProducts() {
        return productsMap.size();
    }


    public void printAllProducts() {
        for (Map.Entry<String, List<Product>> entry : productsMap.entrySet()) {
            String productName = entry.getKey();
            List<Product> productList = entry.getValue();
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }
}


