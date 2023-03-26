package ru.home.homework.lesson3;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {

        // Задача №1
        int[] firstArr = {0, 1, 1, 1, 0, 1, 0};
        System.out.println(Arrays.toString(firstArr));

        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] == 0) {
                firstArr[i] = 1;
            } else {
                firstArr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(firstArr));
        System.out.println("=======================================");

        // Задача №2
        int[] secondArr = new int[100];
        System.out.println(Arrays.toString(secondArr));

        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = i + 1;
        }
        System.out.println(Arrays.toString(secondArr));
        System.out.println("=======================================");

        // Задача №3
        int[] thirdArr = {7, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(thirdArr));

        for (int i = 0; i < thirdArr.length; i++) {
            if (thirdArr[i] < 6) {
                thirdArr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(thirdArr));
        System.out.println("=======================================");

        // Задача №4
        int[][] fourthArr = new int[5][5];

        for (int i = 0; i < fourthArr.length; i++) {
            for (int j = 0; j < fourthArr[i].length; j++) {
                if (fourthArr[i][i] == 0 && i == j) {
                    fourthArr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < fourthArr.length; i++) {
            for (int j = 0; j < fourthArr[i].length; j++) {
                System.out.print(fourthArr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=======================================");

        // Задача №5
        System.out.println(Arrays.toString(printArray(10, 8)));
        System.out.println("=======================================");
    }

    // Задача №5
    public static int[] printArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] += initialValue;
        }
        return arr;
    }
}
