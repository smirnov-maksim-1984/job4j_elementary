package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean a = left > right;
        int result = a ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int maximumNumber = Max.max(1, 2);
        System.out.println(maximumNumber);
    }
}

