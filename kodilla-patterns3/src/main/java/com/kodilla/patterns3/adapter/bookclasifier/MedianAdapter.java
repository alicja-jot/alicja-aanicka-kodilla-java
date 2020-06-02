package com.kodilla.patterns3.adapter.bookclasifier;

import com.kodilla.patterns3.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns3.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns3.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns3.adapter.bookclasifier.librarya.Book> bookASet) {
        Map<BookSignature, com.kodilla.patterns3.adapter.bookclasifier.libraryb.Book> bookBMap = new HashMap<>();

        for (Book bookA : bookASet) {
            String signatureA = bookA.getSignature();

            BookSignature signatureB = new BookSignature(signatureA);
            com.kodilla.patterns3.adapter.bookclasifier.libraryb.Book bookB = new com.kodilla.patterns3.adapter.bookclasifier.libraryb.Book(
                    bookA.getAuthor(),
                    bookA.getTitle(),
                    bookA.getPublicationYear()
            );

            bookBMap.put(signatureB, bookB);
        }

        return medianPublicationYear(bookBMap);
    }
}
