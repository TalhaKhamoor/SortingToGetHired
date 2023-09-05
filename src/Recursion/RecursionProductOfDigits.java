package Recursion;

public class RecursionProductOfDigits {
    public static void main(String[] args) {
        int num = 505;
        int ans = sumUp(num);
        System.out.println(ans);
    }

    private static int sumUp(int num) {
        if(num == 0){
            return 1;
        }
        return num % 10 * sumUp(num/10);
    }

}
