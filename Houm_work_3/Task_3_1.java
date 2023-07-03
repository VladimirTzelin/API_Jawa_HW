package Houm_work_3;
//1. Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task_3_1 {
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
        int i = 0;
        while (i < list1.size()) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            } else {
                i++;
            }
        }
        System.out.printf("Список из нечетных чисел %s", list1);
    }
}