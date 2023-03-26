package ru.home.homework.lesson3.hard;

import java.util.Arrays;
import java.util.Random;

public class HomeWorkAppHard {
    static Random random;

    public static void main(String[] args) {

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
