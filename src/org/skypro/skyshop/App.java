package org.skypro.skyshop;

import org.skypro.skyshop.all.Article;
import org.skypro.skyshop.all.Searchable;
import org.skypro.skyshop.all.SearchEngile;

import org.skypro.skyshop.product.*;

import java.util.Arrays;


public class App {
    public static void main(String[] args) {

        SearchEngile engine = new SearchEngile(10);


        engine.add(new Laptop("Ноутбук","Игровой ноутбук с RTX 4090"));
        engine.add(new Smartphone("Смартфон", "Смартфон с OLED-экраном"));
        engine.add(new Headphones("Наушники", "Беспроводные наушники с шумоподавлением"));


        engine.add(new Article("Обзор ноутбуков", "Лучшие игровые ноутбуки 2024 года"));
        engine.add(new Article("Как выбрать смартфон", "Топ-5 критериев выбора смартфона"));
        engine.add(new Article("Новости технологий", "ИИ в повседневной жизни"));


        System.out.println("=== Поиск по запросу 'ноут' ===");
        Searchable[] results1 = engine.search("ноут");
        System.out.println(Arrays.toString(results1));

        System.out.println("\n=== Поиск по запросу 'Смарт' ===");
        Searchable[] results2 = engine.search("Смарт");
        System.out.println(Arrays.toString(results2));

        System.out.println("\n=== Поиск по запросу 'игр' ===");
        Searchable[] results3 = engine.search("игр");
        System.out.println(Arrays.toString(results3));

        System.out.println("\n=== Поиск по запросу 'телевизор' ===");
        Searchable[] results4 = engine.search("телевизор");
        System.out.println(Arrays.toString(results4));
    }
}


