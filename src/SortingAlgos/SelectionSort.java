package SortingAlgos;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] sortedArray = selectionSort(arr);
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] selectionSort(int[] arr) {
        for(int i=0; i < arr.length; i++){
            int maxIndex = 0;
            for(int j = 0; j < arr.length - i; j++){
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        return arr;
    }
}
