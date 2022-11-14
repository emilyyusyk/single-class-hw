package com.company;

public class Newspaper {
    private String name;
    private int year;
    private int month;
    private int dayOfMonth;
    private boolean isFinnish;
    private String isInFinnish;

    public Newspaper (String name, int year, int month, int dayOfMonth, boolean isFinnish) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        if (isFinnish)
            isInFinnish = "The newspaper is in Finnish.";
        else
            isInFinnish = "The newspaper is not in Finnish";
    }

    public String getName() {
        return name;
    }

    public void setDate (int year, int month, int dayOfMonth) {
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public boolean isFinnish() {
        return isFinnish;
    }

    public String toString () {
        return name + ", " + dayOfMonth + "." + month + "." + year + " / " + isInFinnish;
    }
}
