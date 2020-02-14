package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Set;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        // Given
        Library library = new Library("First library");
        Book book1 = new Book("Zoo", "Kaminski", LocalDate.of(2010,10, 30));
        Book book2 = new Book("Koty", "Kochanowski", LocalDate.of(2000, 2, 20));
        Book book3 = new Book("O psach", "Stoch", LocalDate.of(2014, 5, 1));
        Book book4 = new Book("Słonca", "Lesmian", LocalDate.of(1999, 12, 10));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library clonedLibrary = null;
        try{
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Second library");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library third");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        // When
        Set<Book> books = library.getBooks();
        Set<Book> books2 = clonedLibrary.getBooks();
        Set<Book> books3 = deepClonedLibrary.getBooks();

        // Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(4,library.getBooks().size());
        Assert.assertEquals(4,clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
    }

}
