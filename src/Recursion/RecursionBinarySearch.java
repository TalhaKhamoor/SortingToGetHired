package Recursion;

public class RecursionBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,7,9,13};
        int target = 9;
        int start = 0;
        int end = arr.length - 1;
        int ans = search(arr, target, start, end);
        System.out.println(ans);
    }

    private static int search(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) /2;
        if(arr[mid] == target){
            return mid;
        }
        if(target > arr[mid]){
            start = mid+1;
        }else{
            end = mid -1;
        }
        return search(arr,target,start,end);
    }
}
