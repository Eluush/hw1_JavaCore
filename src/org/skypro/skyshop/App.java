package org.skypro.skyshop;
import org.skypro.skyshop.all.SearchEngile;
import org.skypro.skyshop.backet.FoodProduct;
import org.skypro.skyshop.backet.ProductBasket;
import org.skypro.skyshop.all.BestResultNotFound;
import org.skypro.skyshop.product.Product;


import java.util.List;


public  class App {
    public static void main(String[] args) throws BestResultNotFound {
        ProductBasket basket = new ProductBasket();

        Product apple = new FoodProduct("Apple", "1");
        Product banana = new FoodProduct("Banana", "2");
        Product anotherApple = new FoodProduct("Apple", "3");

        basket.addProduct(apple);
        basket.addProduct(banana);
        basket.addProduct(anotherApple);


        List<Product> removedProducts = basket.removeProductsByName("Apple");

        System.out.println("Удаленные продукты: " + removedProducts.size());
        for (Product product : removedProducts) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }


        basket.printBasket();


        List<Product> emptyRemovedProducts = basket.removeProductsByName("Orange");

        if (emptyRemovedProducts.isEmpty()) {
            System.out.println("Список пуст");
        }


        basket.printBasket();


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




