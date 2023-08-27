package SearchAlgos.BinarySearch;

public class BinarySearchFindRotatedArrayPivot {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        int target = 3;
        int pivot = findPivotIndex(arr);
        System.out.println(pivot);
        int index = findTargetInRotatedArray(arr, target, pivot);
        System.out.println(index);
    }

    private static int findTargetInRotatedArray(int[] arr, int target, int pivot) {
        int start = 0;
        int end = arr.length -1;
        int index;
        if(pivot != -1){
            if (arr[pivot] == target){
                return pivot;
            }
            if(target <= arr[pivot] && target >= arr[start]){
                index = binarySearch(arr, start, pivot, target);
            }else{
                index = binarySearch(arr, pivot+1, end, target);
            }
        }else{
            index = binarySearch(arr, 0, end, target);
        }
        return index;
    }

    private static int binarySearch(int[] arr, int start, int end, int target){
        while(start <= end){
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

    private static int findPivotIndex(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/ 2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid -1]){
                return mid - 1;
            }

            if(arr[mid] <= arr[start]){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
