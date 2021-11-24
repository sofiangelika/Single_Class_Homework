package com.company;

public class Newspaper {
    private String name;
    private int year, month, dayOfMonth;
    private boolean isFinnish;

    public Newspaper (String name, int year, int month, int dayOfMonth, boolean isFinnish) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.isFinnish = isFinnish;
    }

    public String getName() {return name;}

    void setDate (int year, int month, int dayOfMonth) {
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
    }

    public int getYear() {return year;}

    public int getMonth() {return month;}

    public int getDayOfMonth() {return dayOfMonth;}

    public boolean getIsFinnish() {return isFinnish;}

    public String toString() {
        String finnish;
        if (isFinnish)
            finnish = " is a Finnish newspaper";
        else
            finnish = " is not a Finnish newspaper";
        return name + ", " + "(" + dayOfMonth + "." + month + "." + year + ")" + finnish;
    }
}
