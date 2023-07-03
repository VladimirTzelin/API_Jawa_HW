package Houm_work_3;

// 3. Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее ариф. из этого списка.

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину списка N: ");
        int k = scanner.nextInt();
        scanner.close();
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < k; i++) {
            int val = rnd.nextInt(-10, 10);
            list1.add(val);
        }
        System.out.printf("Список исходных чисел:   %s\n", list1);
        int min = list1.get(0);
        int max = list1.get(0);
        float sum = 0;
        for (int i = 0; i < list1.size(); i++) {
            int num = list1.get(i);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }
        float average = sum / list1.size();

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average);
    }
}
