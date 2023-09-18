package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first <= second && first <= third) {
            result = third;
        }
        if (first <= second && third <= second) {
            result = second;
        }
        return result;
    }
}

