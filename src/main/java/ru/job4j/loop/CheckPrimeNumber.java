package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if(number == 1) {
            prime = false;
        }
        for (int index = 2; index < number; index++) {
            if (number % index == 0  && number % number == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

}

