package org.skypro.skyshop;

import org.skypro.skyshop.backet.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {

        Product apple = new Product("Яблоко", 50);
        Product milk = new Product("Молоко", 80);
        Product bread = new Product("Хлеб", 40);
        Product juice = new Product("Сок", 100);
        Product cheese = new Product("Сырки", 200);
        Product eggs = new Product("Яйца", 120);

        ProductBasket basket = new ProductBasket();

        basket.addProduct(apple);
        basket.addProduct(milk);
        basket.addProduct(bread);
        basket.addProduct(juice);
        basket.addProduct(cheese);


        basket.addProduct(eggs);


        System.out.println("Содержимое корзины:");
        basket.printContents();


        System.out.println("\nОбщая стоимость: " + basket.getTotalCost() + " руб.");


        System.out.println("\nЕсть ли в корзине 'Яблоко'? " + basket.containsProduct("Яблоко"));


        System.out.println("Есть ли в корзине 'Колбаса'? " + basket.containsProduct("Колбаса"));


        basket.clearBasket();
        System.out.println("\nКорзина очищена.");


        System.out.println("\nСодержимое корзины после очистки:");
        basket.printContents();


        System.out.println("\nОбщая стоимость пустой корзины: " + basket.getTotalCost() + " руб.");


        System.out.println("\nЕсть ли в корзине 'Молоко'? " + basket.containsProduct("Молоко"));
    }
}



