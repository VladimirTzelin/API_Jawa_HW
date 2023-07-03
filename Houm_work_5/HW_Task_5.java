// package Example_1.Example_1;

import java.util.HashMap;

public class HW_Task_5 {

    // Реализовать структуру телефонной книги с помощью HashMap, с учётом тошго, что 1 человек может иметь несколько телефонов.
// Задан список сотрудников:Пётр Иванов (и остальные).
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.
    public static void main(String[] args) {
        var dict = new HashMap<String, String>();
        dict.put("88003322447", "Иван Васильев");
        dict.put("88007755223", "Пётр Колотов");
        dict.put("88008765432", "Артём Караваев");
        dict.put("88005473292", "Антон Пригожин");
        dict.put("88001198787", "Антон Пригожин");
        dict.put("88001234374", "Артём Караваев");
        dict.put("88004553363", "Валерий Гусев");
        dict.put("88003321875", "Валерий Гусев");
        dict.put("88005467388", "Сергей Пушкин");
        dict.put("88001234376", "Валерий Гусев");
        dict.put("88001237374", "Артём Караваев");
        dict.put("88001434374", "Валерий Гусев");
        dict.put("88007654562", "Иван Колотов");

        var ab = get(dict);

        ab.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));
    }


    public static HashMap<String, Integer> get(HashMap<String, String> dict){
        var result = new HashMap<String, Integer>();
        for (var item : dict.entrySet()) {
            if (result.containsKey(item.getValue())) {
                var key = item.getValue();
                var value = result.get(item.getValue());
                result.replace(key, value + 1);
            } else {
                result.put(item.getValue(), 1);
            }
        }
        return result;
    }
}
//
//    OutPut
//    Валерий Гусев: 4
//    Артём Караваев: 3
//    Антон Пригожин: 2
//    Антон Пригожин: 2
//    Иван Колотов: 1
//    Пётр Колотов: 1
//    Сергей Пушкин: 1
//    Иван Васильев: 1



