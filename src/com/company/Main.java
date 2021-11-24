package com.company;

public class Main {

    public static void main(String[] args) {

        //Homework 2:
        Book[] books = new Book[2];
        books[0] = new Book("1984", new String[]{"George Orwell"}, 1949);
        books[1] = new Book("The Grand Design", new String[]{"Stephen Hawking", "Leonard Mlodinow"}, 2010);
        for (Book b : books)
            System.out.println(b);

        //Homework 3:
        Newspaper newspaper = new Newspaper("Helsingin Sanomat", 2016, 12, 4, true);
        System.out.println(newspaper);

        //Homework 5:
        Point point = new Point(1, 0);
        System.out.println(point.midpoint(-1.1, 5.39));
        System.out.println(point.isInUnitCircle());

    }


}
