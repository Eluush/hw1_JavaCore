package org.skypro.skyshop.all;

import java.util.ArrayList;
import java.util.List;

public class SearchEngile {


    private List<String> data;

    public SearchEngile() {
        this.data = new ArrayList<>();
    }

    public void addData(String item) {
        data.add(item);
    }

    public List<String> search(String query) {
        List<String> results = new ArrayList<>();

        for (String item : data) {
            if (item.contains(query)) {
                results.add(item);
            }
        }

        return results;
    }
}


