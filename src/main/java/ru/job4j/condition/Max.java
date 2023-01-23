package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean a = left > right;
        int result = a? left : right;
        return result;
    }

    public static int max(int left, int right) {
        boolean b = right > left;
        int result = b ? right : left;
        return result;
    }
    public static int max(int left, int right) {
        boolean с = right == left;
        int result = с ? right : left;
        return result;

        public static void main(String[] args) {
        int maximum = Max.max(3, 2);
        System.out.println(maximum);
    }
}

