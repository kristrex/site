package lab2;

import java.util.Random;
import java.util.Arrays;
public class Work2 {
    public void Sum(int mass[]){
        int sum = 0;
        for(int i = 0; i < 5; i++){
            sum += mass[i];
        }
        System.out.println("Сумма чисел с помощью цикла for: " + sum);
        int i = 0;
        sum = 0;
        while(i < 5){
            sum += mass[i];
            i++;
        }
        System.out.println("Сумма чисел с помощью цикла while: " + sum);
        i = 0;
        sum = 0;
        do {
            sum += mass[i];
            i++;
        } while (i < 5);
        System.out.println("Сумма чисел с помощью цикла do while: " + sum);
    }
    public void sumHarmonic(){
        double sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += (double)1 / i;
        }
        System.out.println("Сумма гармонического ряда: " + sum);
    }

    public void sumRandom(){
        int[] n = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++){
            n[i] = random.nextInt(100);
        }
        System.out.println("Массив:" + Arrays.toString(n));
        Arrays.sort(n);
        System.out.println("Отсортированный массив:" + Arrays.toString(n));
    }

    public void searchFactorial(int n){
        int fac = 1;
        for (int i = 1; i <= n; i++){
            fac *= i;
        }
        System.out.println("Факториал " + n + " = " + fac);
    }
}
