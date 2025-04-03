package org.skypro.skyshop.all;

import java.util.*;

public class SearchEngile {

    private Set<Searchable> data;

    public SearchEngile(Object items) {
        this.data = new HashSet<>();
    }


    public void addData(Searchable item) {
        data.add(item);
    }


    public Set<Searchable> search(String query) {
        Set<Searchable> results = new TreeSet<>(new SearchResultComparator());

        for (Searchable item : data) {
            if (item.getName().toLowerCase().contains(query.toLowerCase())) {
                results.add(item);
            }
        }
        return results;
    }

    public class SearchResultComparator implements Comparator<Searchable> {
        @Override
        public int compare(Searchable o1, Searchable o2) {
            int lengthCompare = Integer.compare(
                    o2.getName().length(),
                    o1.getName().length()
            );

            if (lengthCompare == 0) {
                return o1.getName().compareTo(o2.getName());
            }

            return lengthCompare;
        }
    }
}