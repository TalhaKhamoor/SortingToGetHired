package SearchAlgos;

/**
 * Linear Search to count number of even numbers in an array.
 * Main method initializes array of numbers.
 * There are two methods that count the digits in a number. Method 2 is faster.
 */
public class LinearSearchCountEvenNumbers {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findCountOfEvenNumbers(nums));
    }

    static int findCountOfEvenNumbers(int[] nums){
        int count = 0;

        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
//        int numberOfDigits = countDigits(num);
        int numberOfDigits = countDigits2(num);
        return numberOfDigits % 2 == 0;
    }

    /**
     * Slower Method bevause of the while loop
     * @param num
     * @return
     */
    static int countDigits(int num){
        if (num < 0){
            num = num * -1;
        }

        if (num == 0){
            return 1;
        }

        int count = 0;
        while (num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }

    /**
     * This method used math so it's much faster.
     * @param num
     * @return
     */
    static int countDigits2(int num){
        if (num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num))+1;
    }
}
