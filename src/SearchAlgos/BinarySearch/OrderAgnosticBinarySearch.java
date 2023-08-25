package SearchAlgos.BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 6, 2, 0 , -2, -5};
        int target = -2;
        int answer = orderAgnosticBinarySearch(arr, target);
        System.out.println(answer);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[0] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
