package org.skypro.skyshop;

import org.skypro.skyshop.all.SearchEngile;
import org.skypro.skyshop.all.Searchable;
import org.skypro.skyshop.backet.FoodProduct;
import org.skypro.skyshop.backet.ProductBasket;
import org.skypro.skyshop.all.BestResultNotFound;
import org.skypro.skyshop.product.Product;


import java.util.Map;


public class App {
    public static void main(String[] args) throws BestResultNotFound {
        ProductBasket basket = new ProductBasket();

        Product apple = new FoodProduct("Apple", "1");
        Product banana = new FoodProduct("Banana", "2");
        Product anotherApple = new FoodProduct("Apple", "3");

        System.out.println("продукт - " + apple + " цена - " + apple.getPrice());
        System.out.println("продукт - " + banana + " цена - " + banana.getPrice());
        System.out.println("продукт - " + anotherApple + " цена - " + anotherApple.getPrice());


        SearchEngile engine = new SearchEngile();


        engine.addData(new FoodProduct("Apple", "100"));
        engine.addData(new FoodProduct("Banana", "80"));
        engine.addData(new FoodProduct("Pineapple", "200"));


        Map<String, Searchable> results = engine.search("app");


        System.out.println("Найдено " + results.size() + " результатов:");
        results.forEach((name, item) ->
                System.out.println("Название: " + name + ", Цена: " + item.getPrice())
        );
    }
}