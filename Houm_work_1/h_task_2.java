// Вывести все простые числа от 1 до 1000

import java.util.ArrayList;     // Позволяет создавать списки
import java.util.List;          // Добавляет  несколько методов для работы со списками
import java.util.Scanner;       // Простой текстовый сканер, который может анализировать 
                                // примитивные типы и строки с помощью регулярных выражений.
public class h_task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int input = scanner.nextInt();
        scanner.close();

        List<Integer> simples = new ArrayList<>();       

        for (int i = 2; i <= input; i++) {
            boolean isSimple = true;
        
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
            }
        
            if (isSimple) {
                simples.add(i);
            }
        }
        System.out.println("Простые числа: \n" + simples);
    }
}