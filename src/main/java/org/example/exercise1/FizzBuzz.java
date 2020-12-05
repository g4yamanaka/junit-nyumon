package org.example.exercise1;

public class FizzBuzz {
    public static String calculate(int num) {
        if (FizzBuzz.isFizz(num) && FizzBuzz.isBuzz(num)) {
            return "FizzBuzz";
        } else if (FizzBuzz.isBuzz(num)) {
            return "Buzz";
        } else if (FizzBuzz.isFizz(num)) {
            return "Fizz";
        } else {
            return String.valueOf(num);
        }
    }

    public static boolean isFizz(int num) {
        return num % 3 == 0;
    }

    public static boolean isBuzz(int num) {
        return num % 5 == 0;
    }
}
