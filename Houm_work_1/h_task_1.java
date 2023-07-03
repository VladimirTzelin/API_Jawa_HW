// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! 
// (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

import java.util.Scanner;

public class h_task_1 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = number.nextInt();
        int sum = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            factorial *= i;
        }
        System.out.printf("Треугольное число = %d%n", sum);
        System.out.printf("Произведение чисел = %d%n", factorial);

        number.close();
    }
}
