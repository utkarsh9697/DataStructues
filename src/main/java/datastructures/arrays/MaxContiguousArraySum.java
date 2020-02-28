package datastructures.arrays;

public class MaxContiguousArraySum {

    public static final int CONSTANT_VALUE_ZERO = 0;

    public static void main(String[] args) {

        findMaxContiguousArraySum(new int[]{-2, -3, 4, -1, -2, 1, 5, -3});
    }

    /**
     * This method is use to find the max sum value from a given array conditioned that the range consists of contiguous
     * array values
     * Input : -2, -3, 4, -1, -2, 1, 5, -3           // Sample input example
     * Required Output : 7                           // Sample result example
     *
     * @param inputArray : It contains the input array with data values
     */
    private static void findMaxContiguousArraySum(int[] inputArray) {

        int maxRangeSum = CONSTANT_VALUE_ZERO;

        //Loop through outer value (start index of range)
        for (int i = CONSTANT_VALUE_ZERO; i < inputArray.length; i++) {
            //Loop from outer value to end of input array checking for max value of sum
            for (int j = i; j < inputArray.length; j++) {
                int internalRangeSum = 0;
                //Loop to add value at each index in current range
                for (int k = i; k <= j; k++) {
                    internalRangeSum = internalRangeSum + inputArray[k];
                }
                //Compare previous max range value with current range value and allot accordingly if greater
                if (internalRangeSum > maxRangeSum) {
                    maxRangeSum = internalRangeSum;
                }
            }
        }
        System.out.println(maxRangeSum);
    }
}
