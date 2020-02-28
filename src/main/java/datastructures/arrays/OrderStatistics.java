package datastructures.arrays;

public class OrderStatistics {

    public static final int CONSTANT_VALUE_ZERO = 0;
    public static final int CONSTANT_VALUE_FOUR = 4;
    public static final int CONSTANT_VALUE_ONE = 1;

    public static void main(String[] args) {
        findKthSmallestNumber(new int[]{7, 10, 4, 3, 20, 15}, CONSTANT_VALUE_FOUR);
    }

    /**
     * This method is used to find the k'th  smallest number in an unsorted array. Array value have been hard coded for
     * implementation but solution can be extended for dynamic solutions.
     * Input : 7, 10, 4, 3, 20, 15         // Sample input example
     * Required Output : 10     // Sample result example
     *
     * @param inputArray : It contains the data input array
     * @param k          : The k'th smallest number of the input array
     */
    private static void findKthSmallestNumber(int[] inputArray, int k) {
        int requiredValue, temp;

        for (int i = CONSTANT_VALUE_ZERO; i < inputArray.length; i++) {
            for (int j = i + CONSTANT_VALUE_ONE; j < inputArray.length; j++) {
                if (inputArray[j] < inputArray[i]) {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }

        requiredValue = inputArray[k - CONSTANT_VALUE_ONE];
        System.out.println(requiredValue);
    }
}
