package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int x = x2 - x1;
        int y = y2 - y1;
        return  Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 5, 2, 7);
        System.out.println("result (0, 5) to (2, 7) " + result);
    }
}