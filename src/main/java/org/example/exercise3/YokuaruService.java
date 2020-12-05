package org.example.exercise3;

import java.util.List;

public class YokuaruService {
    private YokuaruDao dao;

    public String execute() {
        List<String> hogeResult = this.dao.selectHoge();
        return String.join("★", hogeResult);
    }
}
