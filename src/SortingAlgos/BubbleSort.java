package SortingAlgos;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 10, 4, 8, 6, 7, 1, 9};
        int[] sortedArray = bubbleSort(arr);
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] bubbleSort(int[] arr) {
        boolean swapped;
        for(int i=0; i < arr.length; i++){
            swapped = false;
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }
}
