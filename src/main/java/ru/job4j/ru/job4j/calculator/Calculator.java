package ru.job4j.calculator;

public class Calculator {
    @SuppressWarnings({"checkstyle:EmptyLineSeparator", "checkstyle:WhitespaceAfter"})
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two; //System.out.println(onePlusTwo);

        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo = six / two; //System.out.println(sixDivTwo);
        int fiveMinusTwo = five - two; //System.out.println(fiveMinusTwo);
        int fourTimeTwo = four * two; //System.out.println(fourTimeTwo);


    }
}

class ArgMethod {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Job4j";
        int age = 6;
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
    }
}
