package org.skypro.skyshop.all;

public class SearchEngile {
    private Searchable[] searchables;
    private int currentIndex = 0;

    public SearchEngile(int capacity) {
        searchables = new Searchable[capacity];
    }

    public SearchEngile(Searchable[] searchables) {
        this.searchables = searchables;
    }

    public void add(Searchable item) {
        if (currentIndex < searchables.length) {
            searchables[currentIndex++] = item;
        }
    }

    public Searchable[] search(String query) {
        Searchable[] results = new Searchable[5];
        int count = 0;
        for (Searchable item : searchables) {
            if (item == null) continue;
            if (item.getSearchTerm().contains(query)) {
                results[count++] = item;
                if (count == 5) break;
            }
        }
        return results;
    }

}
