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
        String productName = product.getName();
        products.computeIfPresent(productName, (k, v) -> {
            v.remove(product);
            return v.isEmpty() ? null : v;
        });
    }

    public List<Product> getAllProducts() {
        return products.values().stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    public int getTotalQuantity() {
        return products.values().stream()
                .mapToInt(List::size)
                .sum();
    }

    public void printContents() {
        System.out.println("Содержимое корзины:");
        products.values().stream()
                .flatMap(List::stream)
                .forEach(product ->
                        System.out.println(product.getName() + " - " + product.getPrice() + " руб.")
                );
        System.out.println("Всего товаров: " + getTotalQuantity() + " шт.");
    }

    // Пример метода для подсчёта специальных продуктов
    private long getSpecialCount() {
        return products.values().stream()
                .flatMap(List::stream)
                .filter(product -> product.getPrice() > 1000) // Пример условия
                .count();
    }
}