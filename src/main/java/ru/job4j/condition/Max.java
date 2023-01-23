package ru.job4j.condition;

public class Max {
    public static int max1(int left, int right) {
        boolean a = left > right;
        int result = a ? left : right;
        return result;
    }

    public static int max2(int left, int right) {
        boolean b = right > left;
        int result = b ? right : left;
        return result;
    }

    public static int equals(int left, int right) {
        boolean c = right == left;
        int result = c ? right : left;
        return result;
    }

    public static void main(String[] args) {
        int firstMaxNumber = Max.max1(1, 2);
        int secondMaxNumber = Max.max2(3, 5);
        int equalNumbers = Max.equals(3, 3);
        System.out.println(firstMaxNumber);
        System.out.println(secondMaxNumber);
        System.out.println(equalNumbers);
    }
}

