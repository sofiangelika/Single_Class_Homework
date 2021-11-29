package com.company;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean isOnXAxis() {
        return y == 0;
    }

    public boolean isSameCoordinates(double new_x, double new_y) {
        return x == new_x && y == new_y;
    }

    public double distance(double new_x, double new_y) {
        return Math.sqrt(Math.pow((new_x-x),2) + Math.pow((new_y-y),2));
    }

    public boolean isInUnitCircle() {
        return Math.pow(x, 2) + Math.pow(y, 2) <= 1;
    }

    public String midpoint(double new_x, double new_y) {
        return "Midpoint: (" + ((new_x + x) / 2) + ", " + ((new_y + y) / 2) + ")";
    }
}
