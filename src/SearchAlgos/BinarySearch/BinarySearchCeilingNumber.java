package SearchAlgos.BinarySearch;

public class BinarySearchCeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 14 ,17, 21, 25};
        int target = 18;

        int indexAnswer = searchForCeiling(arr, target);
        System.out.println(indexAnswer);
    }

    /**
     * Ceiling is the smallest element in an array that is greater or equal to target.
     * @param arr
     * @param target
     * @return
     */
    private static int searchForCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = -1;

        while(start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]) {
                end = mid - 1;
            }
        }
        /* For floor aka number that is equal to target or highest number that is less than target, we replace this
         with end
         */
        return start;
    }
}
