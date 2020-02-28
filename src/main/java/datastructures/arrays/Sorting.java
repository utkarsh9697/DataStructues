package datastructures.arrays;

import java.util.Arrays;

public class Sorting {

    public static final int CONSTANT_VALUE_ZERO = 0;
    public static final int CONSTANT_VALUE_ONE = 1;
    public static final int CONSTANT_VALUE_TWO = 2;

    public static void main(String[] args) {
        getAlternateSortedArray(new int[]{7, 1, 2, 3, 4, 5, 6});
    }

    /**
     * This method is used to sort array alternatively with max min values such that max value of array is followed
     * by min value of array followed by second max value and second min value and so on. The array value has been hard
     * coded for implementation but can be extended for dynamic solutions as well
     * Input : 7, 1, 2, 3, 4, 5, 6          // Sample input example
     * Required Output : 7 1 6 2 5 3 4      // Sample result example
     *
     * @param inputArray : Array containing input values
     */
    private static void getAlternateSortedArray(int[] inputArray) {
        int[] requiredArray = new int[inputArray.length];

        //Sorting array to pick one max value and one min value from left and right end of input array respectively
        Arrays.sort(inputArray);

        int requireArrayIndexPosition = CONSTANT_VALUE_ZERO;

        //Picking values from sorted input array and adding value in required array iteratively till middle value
        for (int i = CONSTANT_VALUE_ZERO, k = inputArray.length - CONSTANT_VALUE_ONE;
             i < requiredArray.length / CONSTANT_VALUE_TWO; k--, i++) {
            requiredArray[requireArrayIndexPosition] = inputArray[k];
            requiredArray[requireArrayIndexPosition + CONSTANT_VALUE_ONE] = inputArray[i];
            requireArrayIndexPosition = requireArrayIndexPosition + 2;
        }

        //For odd numbered array add middle vale to last of required array
        if ((inputArray.length) / CONSTANT_VALUE_TWO != CONSTANT_VALUE_ZERO) {
            requiredArray[requiredArray.length - CONSTANT_VALUE_ONE] = inputArray[inputArray.length /
                    CONSTANT_VALUE_TWO];
        }
        printSolution(requiredArray);
    }

    /**
     * Utility method to print array values of required solution.
     *
     * @param arrayRequired : Array containing rotated values
     */
    private static void printSolution(int[] arrayRequired) {
        for (int valueAtEachIndexOfArrayRequire : arrayRequired) {
            System.out.print(valueAtEachIndexOfArrayRequire + " ");
        }
    }
}
