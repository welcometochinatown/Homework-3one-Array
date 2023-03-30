package ru.home.homework.lesson3.hard;

import java.util.Arrays;
import java.util.Random;

public class HomeWorkAppHard {
    static Random random;

    public static void main(String[] args) {

        /*
         задание начинается аналогично первому,
         но теперь массив ты создаешь рандомной длины с помощью метода.
         Каждый раз метод возвращает массив разной длины (я чуть позже напишу с помощью чего это сделать).
         И с помощью другого написанного метода этот массив заполняется рандомно 1 и 0 во все ячейки.

         Далее будет еще метод,
         который на вход берет массив и в цикле должен для каждой ячейки менять 1 на 0 и 0 на 1.
         Метод такой ты должен написать.
         Он получается на вход берет int и возвращает измененный int.

         И наконец последний метод,
         который на вход берет 2 массива: один который ты сам сгенерировал,
         а второй в котором поменял числа. И пробегается по всем элементам этих масссивов
         и сравнивает чтобы числа в одинаковых ячейках не совпадали)
         */

        random = new Random();
        int rand = random.nextInt(10);

        compareArrays(initiateArray(createArray(rand)), checkerArray(initiateArray((createArray(rand)))));
//        initiateArray(createArray(rand));
//        checkerArray(initiateArray(createArray(rand)));
    }

    public static int[] createArray(int length) {
        int[] arr = new int[length];
        return arr;
    }

    public static int[] initiateArray(int[] in) {
        int randomInit;
        for (int i = 0; i < in.length; i++) {
            randomInit = random.nextInt(2);
            if (randomInit > 0) {
                in[i] = 1;
            }
        }
//        System.out.println(Arrays.toString(in));
        return in;
    }

    public static int[] checkerArray(int[] in) {
        for (int i = 0; i < in.length; i++) {
            if (in[i] == 0) {
                in[i] = 1;
            } else if (in[i] == 1) {
                in[i] = 0;
            }
        }
//        System.out.println(Arrays.toString(in));
        return in;
    }

    public static void compareArrays(int[] createdArr, int[] changedArr) {
        for (int i = 0; i < createdArr.length; i++) {
            if (createdArr[i] != changedArr[i]) {
                System.out.println(i + " | index = " + createdArr[i] + " " + changedArr[i] + " НЕ СОВПАЛО");
            } else {
                System.out.println(i + " | index = " + createdArr[i] + " " + changedArr[i] + " СОВПАЛО");
            }
        }
        System.out.println(Arrays.toString(createdArr));
        System.out.println(Arrays.toString(changedArr));
    }

//    public static int createRandom(int num) {
//        random = new Random();
//        int rand = random.nextInt(num);
//        return rand;
//    }
}
