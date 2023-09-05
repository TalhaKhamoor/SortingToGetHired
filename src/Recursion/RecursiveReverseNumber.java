package Recursion;

public class RecursiveReverseNumber {
    static int sum = 0;
    private static void reverse(int num) {
        if(num==0){
            return;
        }

        int remainder = num % 10;
        sum = sum * 10 + remainder;
        reverse(num/10);
    }
    public static void main(String[] args) {
        int num = 54321;
        reverse(num);
        System.out.println(sum);

    }

}
