package com.library.system;

import java.util.Arrays;
import java.util.Comparator;

class Book {
    int bookId;
    String title;
    String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author;
    }
}

public class LibrarySystem {

    public static Book linearSearch(Book[] books, String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public static Book binarySearch(Book[] books, String title) {
        int left = 0, right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = title.compareToIgnoreCase(books[mid].title);

            if (cmp == 0) return books[mid];
            else if (cmp < 0) right = mid - 1;
            else left = mid + 1;
        }
        return null;
    }

    public static void printBooks(Book[] books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "Data Structures", "Mark Allen"),
            new Book(102, "Operating Systems", "Andrew Tanenbaum"),
            new Book(103, "Introduction to Algorithms", "Thomas Cormen"),
            new Book(104, "Database Systems", "Raghu Ramakrishnan"),
            new Book(105, "Computer Networks", "Andrew Tanenbaum")
        };

        Arrays.sort(books, Comparator.comparing(b -> b.title.toLowerCase()));

        System.out.println("Books in Library:");
        printBooks(books);

        System.out.println("\nLinear Search for 'Operating Systems':");
        Book result1 = linearSearch(books, "Operating Systems");
        System.out.println(result1 != null ? result1 : "Book not found");

        System.out.println("\nBinary Search for 'Operating Systems':");
        Book result2 = binarySearch(books, "Operating Systems");
        System.out.println(result2 != null ? result2 : "Book not found");
    }
}
