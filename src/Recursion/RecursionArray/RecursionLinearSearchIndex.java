package Recursion.RecursionArray;

public class RecursionLinearSearchIndex {
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,6,7};
        System.out.println(find(arr, 5, 0));
    }

    static int find(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return find(arr, target, index+1);
    }
}
