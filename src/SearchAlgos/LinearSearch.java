package SearchAlgos;

/**
 *  Linear search class with main method that initializes array and target element and make method calls.
 *  Two methods to search for index of target and value of target element. -1 returned if nothing found.
 *  Extracted method to check if any values are valid.
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6,7,12,43,54};
        int target = 43;

        int index = linearSearchGetIndex(nums, target);
        int element = linearSearchGetElement(nums, target);
        System.out.println("Element found at index: " + index);
        System.out.println("Element found: " + element);
    }
    static int linearSearchGetElement(int[] arr, int target){
        if(validateArray(arr)){
            for (int i : arr) {
                if (i == target) {
                    return i;
                }
            }
        }
        return -1;
    }
    static int linearSearchGetIndex(int[] arr, int target){
        if (validateArray(arr)){
            for (int i = 0; i < arr.length; i++){
                if (arr[i] == target){
                    return i;
                }
            }
        }
        return -1;
    }
    private static boolean validateArray(int[] arr) {
        return arr.length != 0;
    }
}
