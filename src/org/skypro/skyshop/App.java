package org.skypro.skyshop;

import org.skypro.skyshop.all.Article;
import org.skypro.skyshop.all.Searchable;
import org.skypro.skyshop.all.SearchEngile;

import org.skypro.skyshop.product.ext.Headphones;
import org.skypro.skyshop.product.ext.Laptop;
import org.skypro.skyshop.product.ext.Smartphone;

import java.util.Arrays;


public class App {
    public static void main(String[] args) {

        SearchEngile engine = new SearchEngile(10);


        engine.add(new Smartphone("Смартфон Xiaomi", "1"));
        engine.add(new Laptop("Ноутбук Lenovo", "2"));
        engine.add(new Headphones("Наушники Samsung", "3"));
        engine.add(new Headphones("Умные наушники Huawei", "4"));


        engine.add(new Article(
                "Как выбрать смартфон",
                "Рейтинг лучших смартфонов 2023: Xiaomi, Samsung, Apple"
        ));
        engine.add(new Article(
                "Обзор ноутбуков",
                "Топ-5 ноутбуков для работы: Lenovo, ASUS, HP"
        ));
        engine.add(new Article(
                "Гид по планшетам",
                "Сравнение планшетов Samsung и Apple: плюсы и минусы"
        ));
        engine.add(new Article(
                "Умные наушники 2023",
                "Лучшие умные наушники: Huawei vs Xiaomi"
        ));


        System.out.println("=== Поиск 'Xiaomi' ===");
        printResults(engine.search("Xiaomi"));

        System.out.println("\n=== Поиск 'ноутбук' (регистр) ===");
        printResults(engine.search("ноутбук"));

        System.out.println("\n=== Поиск '2023' (общий термин) ===");
        printResults(engine.search("2023"));
    }

    private static void printResults(Searchable[] results) {
        for (int i = 0; i < results.length; i++) {
            if (results[i] != null) {
                System.out.printf("%d. %s\n", i + 1, results[i].getStringRepresentation());
            }
        }
    }
}



