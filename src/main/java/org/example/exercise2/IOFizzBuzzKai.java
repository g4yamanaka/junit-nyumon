package org.example.exercise2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IOFizzBuzzKai {
    public static void printEachNum(int range) {
        calculateEachNum(range).forEach(System.out::println);
    }

    public static List<String> calculateEachNum(int range) {
        return IntStream.range(1, range).boxed()
                .map(IOFizzBuzzKai::calculate)
                .collect(Collectors.toList());
    }

    public static String calculate(int num) {
        if (isFizz(num) && isBuzz(num)) {
            return "FizzBuzz";
        } else if (isBuzz(num)) {
            return "Buzz";
        } else if (isFizz(num)) {
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
