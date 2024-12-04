public class SumAverage {

    /**
     * Computes sum of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return sum of integers
     */
    public static int sum(int lowerBound, int upperBound) {
        int sum = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            sum = sum + i;
        }
        return sum;// fill in code here using for loop and replace the return statement
    }

    /**
     * Computes sum of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return sum of integers
     */
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int value : numbers) {
            sum += value;
        }
        return sum;// fill in code here using for each loop and replace the return statement
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return average of integers
     */
    public static double average(int lowerBound, int upperBound) {
        int sum = 0;
        int c = 0;
        int i = lowerBound;
        while (i <= upperBound) {
            sum = sum + i;
            c = c + 1;
            i++;
        }
        return (double) sum / c;// fill in code here using while loop and replace the return statement
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return average of integers
     */
    public static double average(int[] numbers) {
        //int sum = sum(numbers);
        //return (double) sum / numbers.length;
        int n = 0;
        int sum = 0;
        do {
            sum += numbers[n];
            n++;
        }
        while (n < numbers.length);
        return (double) sum / n;// fill in code here using do-while loop and replace the return statement
    }
}