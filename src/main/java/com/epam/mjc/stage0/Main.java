package com.epam.mjc.stage0;

public class Main {
    public static void main(String[] args) {
        ArrayTasks arrayTasks = new ArrayTasks();

//        int[] positiveArrayVals = arrayTasks.getOnlyPositiveNumbers(new int[]{1, 2, 3, -4, 5, -6, -7, 8, 9, 0});
//
//        for (int positiveArrayVal : positiveArrayVals) {
//            System.out.println(positiveArrayVal);
//        }

//        System.out.println(arrayTasks.reverseArray(new String[]{"Hello", "!", "How", "are", "you"}));

//        System.out.println(arrayTasks.generateNumbers(5));

//        int[][] arr = new int[][]{{-558, -371, -54, 813},
//                                    {-723, 416, 480, 922},
//                                    {-394, 604, 782},
//                                    {669},
//                                    {-677, -497}};  // creates a two-dimensional "ragged" array

        int[][] arr = new int[][]{{5, -3, -5, 1},
                {7, 2, 4, -9},
                {3, 6, 7},
                {6},
                {-6, -4}};  // creates a two-dimensional "ragged" array


        System.out.println(arrayTasks.sortRaggedArray(arr));
    }
}
