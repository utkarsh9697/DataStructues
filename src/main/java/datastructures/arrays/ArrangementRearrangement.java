package datastructures.arrays;


public class ArrangementRearrangement {

    public static final int CONSTANT_VALUE_ZERO = 0;
    public static final int CONSTANT_VALUE_MINUS_ONE = -1;

    public static void main(String[] args) {
        arrangeAtValueEquivalentIndex(new Integer[]{-1, -1, 6, 1, 9, 3, 2, -1, 4, -1});
    }

    /**
     * This method is used to arrange value at each index to it's respective equivalent index if value does not
     * correspond to -1 . Array values have been hard coded for implementation but solution can be extended for
     * dynamic solutions.
     * Input : -1, -1, 6, 1, 9, 3, 2, -1, 4, -1      // Sample input example
     * Required Output : -1 1 2 3 4 -1 6 -1 -1 9     // Sample result example
     *
     * @param inputArray : It contains the input array with data values
     */
    private static void arrangeAtValueEquivalentIndex(Integer[] inputArray) {
        Integer[] requiredArray = new Integer[inputArray.length];

        for (int i = CONSTANT_VALUE_ZERO; i < inputArray.length; i++) {
            if (inputArray[i] == CONSTANT_VALUE_MINUS_ONE) {
                if (null == requiredArray[i]) {
                    requiredArray[i] = CONSTANT_VALUE_MINUS_ONE;
                }
            } else if (inputArray[i] != CONSTANT_VALUE_MINUS_ONE) {
                if (null == requiredArray[inputArray[i]] || requiredArray[inputArray[i]] == CONSTANT_VALUE_MINUS_ONE) {
                    requiredArray[inputArray[i]] = inputArray[i];
                    if (null == requiredArray[i]) {
                        requiredArray[i] = CONSTANT_VALUE_MINUS_ONE;
                    }
                }
            }
        }
        printSolution(requiredArray);
    }

    /**
     * Utility method to print array values of required solution.
     *
     * @param arrayRequired : Array containing rotated values
     */
    private static void printSolution(Integer[] arrayRequired) {
        for (int valueAtEachIndexOfArrayRequire : arrayRequired) {
            System.out.print(valueAtEachIndexOfArrayRequire + " ");
        }
    }
}
