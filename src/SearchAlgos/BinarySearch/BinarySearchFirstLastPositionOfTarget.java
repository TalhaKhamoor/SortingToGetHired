package SearchAlgos.BinarySearch;

public class BinarySearchFirstLastPositionOfTarget {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 3;
        int first = findFirstLastElements(arr, target, true);
        int last = findFirstLastElements(arr, target, false);

    }

    private static int findFirstLastElements(int[] arr, int target, boolean findFirstOccurrence) {
        // initialize start and end variables
        int start = 0;
        int end = arr.length -1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                ans = mid;
                if(findFirstOccurrence){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
