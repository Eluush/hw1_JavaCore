package org.skypro.skyshop.all;

public interface Searchable {
    String getSearchTerm();

    String getContentType();

    String getName();


    default String getStringRepresentation() {
        return getName() + "-" + getContentType();
    }


}
