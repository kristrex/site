package lab10;

import java.util.Scanner;

public class tsk5 {
    public static int SumOfDigit(int n){
        if (n < 10) return n;
        else return n % 10 + SumOfDigit(n/10);

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = input.nextInt();

        System.out.print(SumOfDigit(n));
    }
}
