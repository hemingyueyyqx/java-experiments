package com.experiment01;

public class SummationTest {
    public static void main(String[] args) {
        double n = 3;
        int repeat = 4;
        double current = 0;
        double result = 0;
        for(int i = 0; i < repeat; i++) {
                current = current + n * Math.pow(10, i);
                result += current;
        }
        System.out.println(result);

    }
}
