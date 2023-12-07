package lab11.tsk3;

import lab11.Student;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        Student[] students1 = {
                new Student("Ruslan", 214),
                new Student("Nikita", 231),
                new Student("Anton", 581)
        };

        Student[] students2 = {
                new Student("Natasha", 246),
                new Student("Nastya", 579),
                new Student("Polina", 802)
        };

        System.out.println("Before:");
        System.out.println(Arrays.toString(students1));
        System.out.println(Arrays.toString(students2));

        Student[] mergedStudents = merge(students1, students2);

        System.out.println("After:");
        System.out.println(Arrays.toString(mergedStudents));
    }

    public static Student[] merge(Student[] arr1, Student[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int i = 0, j = 0, k = 0;
        Student[] mergedArr = new Student[len1 + len2];
        while (i < len1 && j < len2) {
            if (arr1[i].getNumber() < arr2[j].getNumber()) {
                mergedArr[k] = arr1[i];
                i++;
            } else {
                mergedArr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < len1) {
            mergedArr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < len2) {
            mergedArr[k] = arr2[j];
            j++;
            k++;
        }
        return mergedArr;
    }
}
