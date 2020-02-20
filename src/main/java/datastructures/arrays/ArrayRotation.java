package datastructures.arrays;

public class ArrayRotation {

    public static final int CONSTANT_VALUE_ZERO = 0;

    public static void main(String[] args) {
        rotateByTwoPositionsToTheLeft(new int[]{1, 2, 3, 4, 5, 6}, 2);
    }

    /**
     * This method is used to rotate the array by two position to the left. Array value have been hard coded for
     * implementation but solution can be extended for dynamic solutions.
     */
    private static void rotateByTwoPositionsToTheLeft(int[] arrayToBeRotated, int displacementUnit) {
        int[] arrayRequired = new int[arrayToBeRotated.length];
        for (int i = CONSTANT_VALUE_ZERO; i < arrayToBeRotated.length; i++) {
            if ((i - displacementUnit) < CONSTANT_VALUE_ZERO) {
                arrayRequired[(arrayRequired.length) - (displacementUnit - i)] =
                        arrayToBeRotated[i];
            } else {
                arrayRequired[i - displacementUnit] = arrayToBeRotated[i];
            }
        }
        printSolution(arrayRequired);
    }

    /**
     * Utility method to print array values of required solution.
     *
     * @param arrayRequired : Array containing rotated values
     */
    private static void printSolution(int[] arrayRequired) {
        for (int valueAtEachIndexOfArrayRequire : arrayRequired) {
            System.out.print(valueAtEachIndexOfArrayRequire);
        }
    }
}
