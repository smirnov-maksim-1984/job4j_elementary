package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(1, 3, 3, 5);
        System.out.println("result (1, 3) to (3, 5) " + result);
        result = Point.distance(1, 1, 2, 3);
        System.out.println("result (1, 1) to (2, 3) " + result);
        result = Point.distance(3, 3, 7, 5);
        System.out.println("result (3, 3) to (7, 5) " + result);
        }
    }
