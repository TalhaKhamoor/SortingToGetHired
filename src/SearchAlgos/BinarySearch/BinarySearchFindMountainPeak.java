package SearchAlgos.BinarySearch;

public class BinarySearchFindMountainPeak {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12, 15, 16, 10, 7, 1};
        int ans = findMountainPeak(arr);
        System.out.println(ans);
    }

    private static int findMountainPeak(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while(start < end){

            int mid = start + (end - start)/ 2;

            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }

}
