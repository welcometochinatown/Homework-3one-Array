package ru.home.homework.lesson3;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {

        /*
        Задача №1 || Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например [0, 1, 1, 1, 0, 1, 0] . С помощью цикла и условия заменить 0 на 1 и 1 на 0.
        */
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

        /*
        Задача №2 || Задать пустой целочисленный массив диной 100.
        С помощью цикла заполнить его значениями 1 2 3 4 ... 100.
        */
        int[] secondArr = new int[100];
        System.out.println(Arrays.toString(secondArr));

        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = i + 1;
        }
        System.out.println(Arrays.toString(secondArr));
        System.out.println("=======================================");

        /*
        Задача №3 || Задать массив [7, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1],
        пройти по нему циклом, и числа меньше 6 умножить на 2.
        */
        int[] thirdArr = {7, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(thirdArr));

        for (int i = 0; i < thirdArr.length; i++) {
            if (thirdArr[i] < 6) {
                thirdArr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(thirdArr));
        System.out.println("=======================================");

        /*
        Задача №4 || Создать квадратный двумерный целочисленный массив
        (количество строк и столбцов одинаковое), и с помощью цикла(ов).
        заполнить его дигональные элементы единицами (можно только 1, если обе сложно).
        */
        int[][] fourthArr = new int[5][5];

        for (int i = 0; i < fourthArr.length; i++) {
            for (int j = 0; j < fourthArr[i].length; j++) {
                if (i == j) {
                    fourthArr[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(fourthArr[i]));
        }
        System.out.println("=======================================");

        /*
        Задача №5 || Написать метод, принимающий на выход два аргумента len И initialValue,
        и возвращающий одномерный массив типа int, каждая ячейка которого равна initialValue.
        */
        System.out.println(Arrays.toString(printArray(10, 11)));
        System.out.println("=======================================");
    }

    // Задача №5
    public static int[] printArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
