package com.experiment01;

public class BubbleSortTest {
    public static void main(String[] args) {
        sort();
    }
    private static void sort() {
        int[] ints={8, 3, 4, 22, 1};
        for(int i = 0; i < ints.length-1 ; i++) {
            for(int j = i + 1; j < ints.length; j++) {
                if(ints[i] > ints[j]) {
                    int temp = ints[j];
                    ints[j] = ints[i];
                    ints[i] = temp;
                }
            }
        }
        for(int i : ints) {
            System.out.println(i);
        }
    }
}
