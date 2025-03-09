package org.skypro.skyshop.backet;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;

public class ProductBasket {
    private final Product[] products = new Product[5];

    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
        System.out.println("Невозможно добавить продукт");
    }

    public int getTotalCost() {
        int total = 0;
        for (Product product : products) {
            if (product != null) {
                total += product.getPrice();
            }
        }
        return total;
    }

    public void printContents() {

        boolean isEmpty = true;
        int total = 0;
        int specialCount = 0;

        for (Product product : products) {
            if (product != null) {
                isEmpty = false;
                System.out.println(product);
                total += product.getPrice();
                if (product.isSpesial()) {
                    specialCount++;
                }
            }
        }

        if (isEmpty) {
            System.out.println("в корзине пусто");
        } else {
            System.out.println("Итого: " + total);
            System.out.println("Специальных товаров: " + specialCount);
        }
    }

    public boolean containsProduct(String name) {
        for (Product product : products) {
            if (product != null && product.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void clearBasket() {
        Arrays.fill(products, null);
    }
}



