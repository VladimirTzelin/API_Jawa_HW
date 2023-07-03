package Houm_work_3;
//1. Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите длину списка N: ");
        int num = scanner.nextInt();
        scanner.close();
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < num; i++) {
            int val = rnd.nextInt(-19, 20);
            list1.add(val);
        }
        System.out.printf("\nСписок исходных чисел:   %s\n", list1);

        int i = 0;
        while (i < list1.size()) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            } 
            else {
                i++;
            }
        }
        System.out.printf("Список из нечетных чисел %s", list1);
        int min = list1.get(0);
        int max = list1.get(0);
        float sum = 0;
        for (int j = 0; j < list1.size(); j++) {
            num = list1.get(j);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }
        float average = sum / list1.size();

        System.out.println("\n\nМинимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average + "\n");
    }
}
