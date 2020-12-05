package org.example.exercise3;

import java.util.Arrays;
import java.util.List;

public class YokuaruDao {
    public List<String> selectHoge() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ignored) { }
        return Arrays.asList("hoge", "huga");
    }
}
