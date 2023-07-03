
import java.util.Scanner;

public class h_task_3 {
    public static void main(String[] args) {
        System.out.println("Введите первый операнд: ");
        Scanner scan = new Scanner(System.in);
        float oper1 = scan.nextFloat();
        System.out.println("Укажите одну из изопераций (+, -, *, /): ");
        String arithOp = scan.next();
        System.out.println("Введите второй операнд: ");
        float oper2 = scan.nextFloat();
        float res = 0;
        System.out.println("Результат выполнения: \t" + oper1 + " "+ arithOp+ " " + oper2);
        switch (arithOp) {
            case "+":
                res = oper1 + oper2;
                System.out.println("\t\t\t= " + res);
                break;
            case "-":
                res = oper1 - oper2;
                System.out.println("\t\t\t= " + res);
                break;
            case "*":
                res = oper1 * oper2;
                System.out.println("\t\t\t= " + res);
                break;
            case "/":
                if (oper2 != 0) {
                    res = oper1 / oper2;
                    System.out.println("\t\t\t=" + res);
                } else {
                    System.out.println("Введено некорректное значение операнда. \nДеление на ноль невозможно!");
                }
                break;
        }
        scan.close();
    }
}