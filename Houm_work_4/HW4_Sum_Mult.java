// Даны два Deque, представляющие два целых числа. 
// Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка.
// Одно или два числа могут быть отрицательными.
// 
// [3,2,1] - пример Deque
// [5,4,3]- пример второго Deque
// 1) 123 * 345 = 42 435 - связный список, в обычном порядке [4,2,4,3,5]
// 2) 123 + 345 = 670
//
//Вывод решения:
// deque1:[3, 2, 1]
// deque2:[7, 4, 5]
// Сумма 670
// deque_Sum:[6, 7, 0]       
// Произведение 67281 
// deque_Mult:[6, 7, 2, 8, 1]
 
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class HW4_Sum_Mult {    
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(3,2,1));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(7,4,5));
        System.out.println("deque1:" + d1 + "\ndeque2:" + d2);
        
        Deque<Integer> rez_DS = new ArrayDeque<>(sum(d1, d2));               
        System.out.println("Сумма " + toInt(rez_DS));              
        reverseQueue(rez_DS);
        System.out.println("deque_Sum:" + rez_DS);  
        
        Deque<Integer> rez_DM = new ArrayDeque<>(mult(d1, d2));        
        System.out.println("Произведение " + toInt(rez_DM)); 
        reverseQueue(rez_DM);
        System.out.println("deque_Mult:" + rez_DM);  
    }

    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        //System.out.println("deque1:" + d1 + " deque2:" + d2);
        return toDeque(toInt(d1) + toInt(d2));
    }

    public static Deque<Integer> mult(Deque<Integer> d1, Deque<Integer> d2) {
        return toDeque(toInt(d1) * toInt(d2));
    }

    public static int toInt(Deque<Integer> deq) {
        int n = 0;
        int i = 0;
        Deque<Integer> temp_dq = new ArrayDeque<>(deq);
        while(temp_dq.size() > 0) {
            n += temp_dq.removeFirst() * Math.pow(10, i++);
        }
        return n;
    }

    public static ArrayDeque<Integer> toDeque(int n) {
        ArrayDeque<Integer> rezDeq = new ArrayDeque<>();
        while (n > 0) {
            rezDeq.add(n % 10);
            n /= 10;
        }
        return rezDeq;
    }  

    public static <T> void reverseQueue(Queue<T> q) {
    List<T> copy = new ArrayList<>(q);
    Collections.reverse(copy);
    q.clear();
    q.addAll(copy);
}
   
}
