package com.company.structural_patterns.decorators;

public interface DataSource {
    void writeData(String data);
    String readData();
}
