package com.max.idea;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        int [] massiv = new int[] {1, 8, 5, 9, 2};
        int dlinamassiva = massiv.length;
        int temp = massiv[0];
        massiv[0] = massiv[dlinamassiva - 1];// pervomy prisvoili poslednee
        massiv[dlinamassiva - 1] = temp;
        System.out.println(massiv[0] + massiv[dlinamassiva/2]);
    }

}
