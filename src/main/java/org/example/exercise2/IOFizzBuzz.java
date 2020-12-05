package org.example.exercise2;

public class IOFizzBuzz {
    public static void printEachNum(int num) {
        for (int i = 1; i <= num; i++) {
            if (IOFizzBuzz.isFizz(i) && IOFizzBuzz.isBuzz(i)) {
                System.out.println("FizzBuzz");
            } else if (IOFizzBuzz.isBuzz(i)) {
                System.out.println("Buzz");
            } else if (IOFizzBuzz.isFizz(i)) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static boolean isFizz(int num) {
        return num % 3 == 0;
    }

    public static boolean isBuzz(int num) {
        return num % 5 == 0;
    }
}
