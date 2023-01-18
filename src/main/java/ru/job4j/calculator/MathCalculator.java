package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumSubtractionAndDiv(double first, double second) {
        return subtraction(first, second)
                + div(first, second);
    }

    public static double sumAllOperations(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtraction(first, second)
                + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета метода 2 равен: " + sumSubtractionAndDiv(10, 20));
        System.out.println("Результат расчета метода 3 равен: " + sumAllOperations(10, 20));
    }
}
