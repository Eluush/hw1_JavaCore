package org.skypro.skyshop;

import org.skypro.skyshop.backet.ProductBasket;
import org.skypro.skyshop.backet.SimpleProduct;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();

        SimpleProduct milk = new SimpleProduct("Молоко", 50);
        SimpleProduct apple = new SimpleProduct("Яблоки", 100);
        DiscountedProduct fish = new DiscountedProduct("Рыба", 200, 20);
        DiscountedProduct meat = new DiscountedProduct("Мясо", 300, 30);
        FixPriceProduct spices = new FixPriceProduct("Специи");

        basket.addProduct(milk);
        basket.addProduct(apple);
        basket.addProduct(fish);
        basket.addProduct(meat);
        basket.addProduct(spices);


        basket.printContents();

    }
}



