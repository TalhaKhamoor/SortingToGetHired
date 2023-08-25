package SearchAlgos.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-14,-12, -4, 0, 2, 4, 6, 7, 12, 45, 76};
        int target = 12;
        int answer = binarySearch(arr, target);
        System.out.println(answer);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            }else if ( target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }

        return -1;
    }
}
