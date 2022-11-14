package com.company;

public class Point {
    private double x;
    private double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean isItOnX () {
        return y == 0;
    }

    public boolean hasTheSamePoint (Point point2) {
        return point2.x == x && point2.y == y;
    }

    public double distance (Point point2) {
        return Math.sqrt ((x - point2.x) * (x - point2.x) + (y - point2.y) * (y - point2.y));
    }

    public boolean isItOnUnitCircle () {
        return Math.sqrt((x * x) + (y * y)) <= 1;
    }

    public Point midpoint (Point point2) {
        double midpointX = (x + point2.y) / 2;
        double midpointY = (y + point2.y) / 2;
        return new Point (midpointX, midpointY);
    }

    public String toString () {
        return "(" + x + ", " + y + ")";
    }
}
