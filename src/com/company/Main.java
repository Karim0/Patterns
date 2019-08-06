package com.company;

public class Main {
    int k = 20;
    int i = getInt();


    public int getInt() {
        return k + 1;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.i + " " + main.k);
    }
}
