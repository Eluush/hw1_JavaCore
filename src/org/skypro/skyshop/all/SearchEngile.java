package org.skypro.skyshop.all;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SearchEngile {
    private List<Searchable> data; // Изменено на список Searchable

    public SearchEngile() {
        this.data = new ArrayList<>();
    }

    // Метод добавления Searchable-объектов
    public void addData(Searchable item) {
        data.add(item);
    }

    // Метод поиска, возвращающий отсортированную мапу
    public Map<String, Searchable> search(String query) {
        Map<String, Searchable> results = new TreeMap<>();

        for (Searchable item : data) {
            // Проверка, содержит ли имя объекта запрос
            if (item.getName().toLowerCase().contains(query.toLowerCase())) {
                // Автоматическая сортировка по имени (ключу) через TreeMap
                results.putIfAbsent(item.getName(), item); // Игнорирование дубликатов
            }
        }
        return results;
    }
}

