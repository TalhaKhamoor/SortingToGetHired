package Recursion;

public class RecursionFactorial {
    public static void main(String[] args) {
        int num = 5;
        int ans = factorial(num);
        System.out.println(ans);
    }

    private static int factorial(int num) {
        if(num <= 1){
            return 1;
        }
        return num * factorial(num-1);
    }
}
