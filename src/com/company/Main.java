package com.company;

public class Main {

    public static void main(String[] args) {
	Book[] books = new Book[2];

	String[] authors_0 = {"George Orwell"};
    books[0] = new Book("1984", authors_0, 1949);

    String[] authors_1 = {"Stephen Hawking", "Leonard Mlodinow"};
    books[1] = new Book("The Grand Design", authors_1, 2010);

    for (Book b : books)
        System.out.println(b);
    }
}
