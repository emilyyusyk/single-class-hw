package com.company;
import ibcsutils.Book;

public class hw2 {
    public static void main(String[] args) {
        Book [] books = new Book [2];
        String [] authors1 = {"A", "K"};
        String [] authors2 = {"S", "O"};
        books [0] = new Book ("Amber", authors1, 2020);
        books [1] = new Book ("Swan", authors2, 2021);

        for (Book b : books)
            System.out.println (b);
    }
}
