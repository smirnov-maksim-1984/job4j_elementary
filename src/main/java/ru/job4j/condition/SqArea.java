package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
        double h = p / (2 * (k + 1));
        double i = h * k;
        return i * h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
        result1 = SqArea.square(8, 4);
        System.out.println(" p = 8, k = 4, s = 2.560, real = " + result1);
        result1 = SqArea.square(12, 8);
        System.out.println(" p = 12, k = 8, s = 3.555, real = " + result1);
    }
}


