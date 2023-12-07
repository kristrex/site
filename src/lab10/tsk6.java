package lab10;

import java.util.Scanner;

public class tsk6 {
    public static void print(int n, int del){
        if (del == n) {
            System.out.println(n + " is a natural number.");
        } else {
            System.out.println(n + " is not a natural number.");
        }
    }
    public static void SimpleNumber(int n, int del){
        if (n % del == 0) print(n, del);
        else SimpleNumber(n, del+1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = input.nextInt();
        SimpleNumber(n, 2);
    }
}
