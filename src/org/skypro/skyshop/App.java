package org.skypro.skyshop;
import org.skypro.skyshop.all.SearchEngile;
import org.skypro.skyshop.backet.FoodProduct;
import org.skypro.skyshop.backet.ProductBasket;
import org.skypro.skyshop.all.BestResultNotFound;


import java.util.List;


public  class App {
    public static void main(String[] args) throws BestResultNotFound {
        ProductBasket cart = new ProductBasket();

        cart.addProduct(new FoodProduct("Apple", 10));
        cart.addProduct(new FoodProduct("Banana", 20));


        cart.addProduct(new FoodProduct("Orange", 30));

        cart.printAllProducts();




        SearchEngile searchEngine = new SearchEngile();

        searchEngine.addData("Apple pie");
        searchEngine.addData("Banana bread");
        searchEngine.addData("Apple tart");


        List<String> searchResults = searchEngine.search("Apple");

        System.out.println("Результаты поиска:");
        for (String result : searchResults) {
            System.out.println(result);
        }

    }
}




