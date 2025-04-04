package org.skypro.skyshop.all;

import java.util.Comparator;

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

