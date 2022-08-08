package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String[] seasonsList = new String[] {"winter", "spring", "summer", "autumn"};
        return seasonsList;
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] numbersList = new int[length];

        for (int index = 0; index < length; index++) {
            numbersList[index] = index + 1;
        }
        return numbersList;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == number) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] revertedText = new String[arr.length];
        int arrLength = arr.length - 1;
        for (int index = 0; index < arr.length; index ++) {
            revertedText[index] = arr[arrLength];
            arrLength--;
        }
        return revertedText;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int[] newArr = new int[arr.length];
        int counter = 0;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] > 0) {
                newArr[counter] = arr[index];
                counter++;
            }
        }

        int[] arrToReturn = new int[(counter)];

        for (int index = 0; index < counter; index++) {
            arrToReturn[index] = newArr[index];
        }
        return arrToReturn;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        int greatestVal = 0;
        int indexRow = 0;
        int indexCol = 0;
        int rowColumn = 1;
//        System.out.println(arr);

        for (indexRow = 0; indexRow < arr.length; indexRow++) {
            for (indexCol = 0; indexCol < arr[indexRow].length - 1; indexCol++) {
                for (rowColumn = 1; rowColumn < (arr[indexRow].length - indexCol); rowColumn++) {
                    if (arr[indexRow][rowColumn - 1] > arr[indexRow][rowColumn]) {
                        greatestVal = arr[indexRow][rowColumn - 1];
                        arr[indexRow][rowColumn - 1] = arr[indexRow][rowColumn];
                        arr[indexRow][rowColumn] = greatestVal;
                    }
                }
            }
        }

        for (indexRow = 0; indexRow < arr.length; indexRow++) {
            for (indexCol = 1; indexCol < arr.length - indexRow; indexCol++) {
                if (arr[indexCol - 1].length > arr[indexCol].length) {
                    int[] tmpArr = arr[indexCol - 1];
                    arr[indexCol - 1] = arr[indexCol];
                    arr[indexCol] = tmpArr;
                }
            }
        }

        return arr;
    }
}
