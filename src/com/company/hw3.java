package com.company;

public class hw3 {
    public static void main(String[] args) {
        Newspaper [] newspapers = new Newspaper [2];
        newspapers [0] = new Newspaper ("A", 2022, 12, 24, false);
        newspapers [1] = new Newspaper ("B", 2000, 1, 1, true);
        newspapers [1].setDate (1999,2, 2);

        for (Newspaper n : newspapers)
            System.out.println (n);
    }
}
