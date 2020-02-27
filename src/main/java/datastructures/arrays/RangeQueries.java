package datastructures.arrays;

public class RangeQueries {

    public static final int CONSTANT_VALUE_ZERO = 0;
    public static final int CONSTANT_VALUE_ONE = 1;

    public static void main(String[] args) {

        // Input data array on which sum of value is to be found
        int[] inputDataArray = {1, 1, 2, 1, 3, 4, 5, 2, 8};

        // Query array providing the range of upper and lower bounds for sum calculation on input data array
        int[][] inputQueryArray = {
                {0, 4},
                {1, 3},
                {2, 4}
        };

        printSumOfValuesInQueryRange(inputDataArray, inputQueryArray);
    }

    /**
     * This method is used to find the sum of every query range in data array from the provided query array.
     * Array values have been hard coded for implementation but solution can be extended for dynamic solutions.
     */
    private static void printSumOfValuesInQueryRange(int[] inputDataArray, int[][] inputQueryArray) {
        for (int i = CONSTANT_VALUE_ZERO; i < inputQueryArray.length; i++) {

            int requiredRangeSum = CONSTANT_VALUE_ZERO;
            int lowerBoundValue = inputQueryArray[i][CONSTANT_VALUE_ZERO];
            int upperBoundValue = inputQueryArray[i][inputQueryArray[i].length - CONSTANT_VALUE_ONE];

            for (int k = lowerBoundValue; k <= upperBoundValue; k++) {
                requiredRangeSum = requiredRangeSum + inputDataArray[k];
            }

            System.out.println(requiredRangeSum);
        }
    }
}
