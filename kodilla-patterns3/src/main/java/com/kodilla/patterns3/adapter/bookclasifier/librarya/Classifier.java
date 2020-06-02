package com.kodilla.patterns3.adapter.bookclasifier.librarya;

import java.util.Set;

public interface Classifier {

    int publicationYearMedian(Set<Book> bookSet);
}
