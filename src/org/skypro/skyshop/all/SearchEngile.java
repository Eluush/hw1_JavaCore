package org.skypro.skyshop.all;

import org.skypro.skyshop.all.BestResultNotFound;

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

    public Searchable findBestMatch(String search) throws BestResultNotFound {
        Searchable bestMatch = null;
        int maxCount = 0;

        for (Searchable item : searchables) {
            if (item != null) {
                String term = item.getSearchTerm().toLowerCase();
                int count = countOccurrences(term, search.toLowerCase());
                if (count > maxCount) {
                    maxCount = count;
                    bestMatch = item;
                }
            }
        }

        if (bestMatch == null) {
            throw new BestResultNotFound("Не найден подходящий элемент для запроса: " + search);
        }

        return bestMatch;
    }

    private int countOccurrences(String text, String search) {
        int count = 0;
        int index = 0;

        while ((index = text.indexOf(search, index)) != -1) {
            count++;
            index += search.length();
        }

        return count;
    }
}
