package Recursion;

public class RecursionSumOfDigits {
    public static void main(String[] args) {
        int num = 3209;
        int ans = sumUp(num);
        System.out.println(ans);
    }

    private static int sumUp(int num) {
        if(num == 0){
            return num;
        }
        return num % 10 + sumUp(num/10);
    }

}
