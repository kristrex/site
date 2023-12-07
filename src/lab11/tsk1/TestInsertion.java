package lab11.tsk1;

import lab11.Student;
import java.util.Arrays;

public class TestInsertion {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Katya",  1),
                new Student("Vika",  960),
                new Student("Dasha", 320)
        };

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(students));

        insertionSort(students);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(students));
    }
    public static void insertionSort(Student[] input) {
        for (int i = 1; i < input.length; i++) {
            Student key = input[i];
            int j = i - 1;
            while (j >= 0 && input[j].getNumber() > key.getNumber()) {
                input[j + 1] = input[j];
                j = j - 1;
            }
            input[j + 1] = key;
        }
    }
}
