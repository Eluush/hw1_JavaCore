package org.skypro.skyshop;

import org.skypro.skyshop.all.Article;
import org.skypro.skyshop.all.Searchable;
import org.skypro.skyshop.all.SearchEngile;

import org.skypro.skyshop.backet.ProductBasket;
import org.skypro.skyshop.backet.SimpleProduct;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.all.BestResultNotFound;
import org.skypro.skyshop.product.Product;


public class App {
    public static void main(String[] args) throws BestResultNotFound {

        ProductBasket basket = new ProductBasket();
        SearchEngile searchEngine = new SearchEngile(10);

        Article article1 = new Article("Польза яблок", "Яблоки полезны для здоровья.");
        Article article2 = new Article("Секреты бананов", "Бананы содержат много калия.");

        searchEngine.add(article1);
        searchEngine.add(article2);

        try {
            Searchable bestMatch = searchEngine.findBestMatch("яблоки");
            System.out.println("Лучший результат для 'яблоки': " + bestMatch.getStringRepresentation());

            bestMatch = searchEngine.findBestMatch("не существующий запрос");
            System.out.println("Лучший результат для 'не существующий запрос': " + bestMatch.getStringRepresentation());


        } finally {
            System.out.println( "finally block");
        }

        }

    private static void testInvalidSimpleProduct() {
        try {
            SimpleProduct invalidName = new SimpleProduct("   ", "1", 100);
        } catch (IllegalArgumentException e) {
            System.out.println("[Ошибка] SimpleProduct (имя): " + e.getMessage());
        }


        try {
            SimpleProduct invalidPrice = new SimpleProduct("Молоко", "2", 0);
        } catch (IllegalArgumentException e) {
            System.out.println("[Ошибка] SimpleProduct (цена): " + e.getMessage());
        }
    }

    private static void testInvalidDiscountedProduct() {
        try {
            DiscountedProduct invalidName = new DiscountedProduct("  ", "3", 200, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("[Ошибка] DiscountedProduct (имя): " + e.getMessage());
        }


        try {
            DiscountedProduct invalidPrice = new DiscountedProduct("Чай", "4", -50, 20);
        } catch (IllegalArgumentException e) {
            System.out.println("[Ошибка] DiscountedProduct (цена): " + e.getMessage());
        }


        try {
            DiscountedProduct invalidDiscount = new DiscountedProduct("Кофе", "5", 100, 110);
        } catch (IllegalArgumentException e) {
            System.out.println("[Ошибка] DiscountedProduct (скидка): " + e.getMessage());
        }


    }
}





