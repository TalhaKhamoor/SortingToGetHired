package SearchAlgos;

import java.util.Arrays;

public class LinearSearch2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {12,23,45},
                {43,51,61,74},
                {64,75,85,93},
                {23,4}
        };
        int target = 85;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        for(int row=0; row < arr.length; row++){
            for (int col=0; col < arr[row].length; col++){
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }


}
