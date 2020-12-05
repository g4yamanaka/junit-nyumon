package org.example.exercise2;

import java.time.LocalTime;

public class NotPureGreeting {
    public static String greeting() {
        if (isMorning()) {
            return "おはようi";
        } else if (isAfternoon()) {
            return "こんにちは";
        } else if (isEvening()) {
            return "こんばんは";
        } else {
            throw new IllegalStateException("不届きものが!!!");
        }
    }

    public static boolean isMorning() {
        LocalTime now = LocalTime.now();
        return now.isAfter(LocalTime.of(7, 0)) &&
                now.isBefore(LocalTime.of(12,0));
    }

    public static boolean isAfternoon() {
        LocalTime now = LocalTime.now();
        return now.isAfter(LocalTime.of(12, 0)) &&
                now.isBefore(LocalTime.of(19, 0));
    }

    public static boolean isEvening() {
        LocalTime now = LocalTime.now();
        return now.isAfter(LocalTime.of(19, 0)) &&
                now.isBefore(LocalTime.of(7,0));
    }
}
