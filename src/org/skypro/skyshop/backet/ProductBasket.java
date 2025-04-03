package org.skypro.skyshop.backet;

import org.skypro.skyshop.product.Product;

import java.util.*;
import java.util.stream.Collectors;

public class ProductBasket {
    private Map<String, List<Product>> products = new HashMap<>();

    public ProductBasket() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product product) {
        String productName = product.getName();
        products.computeIfAbsent(productName, k -> new ArrayList<>()).add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getAllProducts() {
        return products.values().stream().flatMap(List::stream).collect(Collectors.toList());
    }

    public int getTotalQuantity() {
        return products.values().stream().mapToInt(List::size).sum();
    }


    public void printContents() {
        System.out.println("Содержимое корзины:");
        products.forEach((name, items) ->
                items.forEach(product ->
                        System.out.println(product.getName() + " - " + product.getPrice() + " руб.")
                )
        );
        System.out.println("Всего товаров: " + getTotalQuantity() + " шт.");
    }
}