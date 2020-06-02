package com.kodilla.patterns3.adapter.bookclasifier;

import com.kodilla.patterns3.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MedianAdapterTestSuite {

    private MedianAdapter medianAdapter = new MedianAdapter();

    @Test
    void publicationYearMedian() {
        // given
        Set<Book> bookASet = new HashSet<>();
        bookASet.add(new Book("Mickiewicz", "Dziady I", 1788, "1234567"));
        bookASet.add(new Book("Mickiewicz", "Dziady II", 1790, "1234568"));
        bookASet.add(new Book("Mickiewicz", "Dziady III", 1800, "1234569"));
        bookASet.add(new Book("Mickiewicz", "Dziady IV", 1800, "12345610"));
        bookASet.add(new Book("Mickiewicz", "Dziady V", 1802, "12345611"));
        bookASet.add(new Book("Słowacki", "Kordian", 1850, "12345612"));

        // when
        int result = medianAdapter.publicationYearMedian(bookASet);

        // then
        assertEquals(1800, result);
    }
}