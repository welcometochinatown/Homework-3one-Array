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

        Сначала давай разберём кейс. Чтобы заполнить вторую диагональ,
        надо сначала понять по какой логике идет заполнение.
        Мы берём как в твоем примере массив из 5 ячеек.
        Нужно заполнить [0][4] -> [1][3] -> [2][2] -> [3][1] и [4][0]

        Если посмотреть внимательно, то числа идут в одном массиве на увеличение,
        в другом на понижение. Но есть еще закономерность.
        Цифры зеркально повторяются (например [1][3] и [3][1] из чего я делаю вывод,
        что можно пробежаться лишь по половине массива и заполнить как обычные значение,
        так сразу и зеркальные.
        Перед началом вложенного цикла нужны 2 переменные.
        Одна проинициализирона размером массива - 1 (так как ячейки с нуля начинаются) вторая 0.

        Пока писал придумал еще проще.
        Мы делаем один всего лишь цикл который будет продолжаться длиннаМассива/2 раз.
        И цикл сразу будет заполнять массив[1яПеременная][2яПеременная] и тут же [2яПеременна][1переменная]
        после чего первая переменная ++, вторая —. Потом следующий ход цикла
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
           0  1  2  3  4
        0 [0, 0, 0, 0, 1] | [0][4] :: [i][5 - i - 1] -> [0][5 - 0 - 1] -> [0][4]
        1 [0, 0, 0, 1, 0] | [1][3] :: [i][5 - i - 1] -> [1][5 - 1 - 1] -> [1][3]
        2 [0, 0, 1, 0, 0] | [2][2] :: [i][5 - i - 1] -> [2][5 - 2 - 1] -> [2][2]
        3 [0, 1, 0, 0, 0] | [3][1] :: [i][5 - i - 1] -> [3][5 - 3 - 1] -> [3][1]
        4 [1, 0, 0, 0, 0] | [4][0] :: [i][5 - i - 1] -> [4][5 - 4 - 1] -> [4][0]
        */

        int[][] fourthArrNew = new int[5][5];
        for (int i = 0; i < fourthArrNew.length; i++) {
            for (int j = 0; j < fourthArrNew[i].length; j++) {
                fourthArrNew[i][fourthArrNew.length - i - 1] = 1;
            }
            System.out.println(Arrays.toString(fourthArrNew[i]));
        }
        System.out.println("=======================================");

        int[][] arrCombine = new int[5][5];
        for (int i = 0; i < arrCombine.length; i++) {
            for (int j = 0; j < arrCombine[i].length; j++) {
                arrCombine[i][arrCombine.length - i - 1] = 1;
                if (i == j) {
                    arrCombine[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(arrCombine[i]));
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
