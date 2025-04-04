package org.skypro.skyshop.all;

import java.util.*;
import java.util.stream.Collectors;

public class SearchEngile {

    private Set<Searchable> data;

    public SearchEngile(Object items) {
        this.data = new HashSet<>();
    }


    public void addData(Searchable item) {
        data.add(item);
    }


    public Set<Searchable> search(String query) {
        return data.stream()
                .filter(item -> item.getName().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toCollection(() -> new TreeSet<>(new SearchResultComparator())));
    }
}







