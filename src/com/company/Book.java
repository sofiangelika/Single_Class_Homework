package com.company;

public class Book {
    String title;
    String[] authors;
    int publication_year;

    public Book (String title, String[] authors, int publication_year) {
        this.title = title;
        this.authors = authors;
        this.publication_year = publication_year;
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < authors.length; i++) {
            buffer.append(authors[i]);
            if (i != authors.length - 1)
                buffer.append(" & ");
        }
        buffer.append(": " + title + " ");
        buffer.append("(" + publication_year + ")");

        return buffer.toString();
    }

}
