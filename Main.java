package ru.fsv67;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    /*
     * 1 Создайте коллекцию мужских и женских имен с помощью интерфейса List ●
     * Отсортируйте коллекцию в алфавитном порядке ● Отсортируйте коллекцию по
     * количеству букв в слове ● Разверните коллекцию
     */
    /*
     * 2 Создайте коллекцию мужских и женских имен с помощью интерфейса List -
     * добавьте повторяющиеся значения Получите уникальный список Set на
     * основании List Определите наименьший элемент (алфавитный порядок)
     * Определите наибольший элемент (по количеству букв в слове но в обратном
     * порядке) Удалите все элементы содержащие букву ‘A’
     */

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Алексей");
        names.add("Иван");
        names.add("Иван");
        names.add("Олег");
        names.add("Максим");
        names.add("Анна");
        names.add("Анна");
        names.add("Ольга");
        names.add("Ксения");
        names.add("Анастасия");
        names.add("Анастасия");
        names.add("Светлана");
        names.add("Светлана");
        names.sort(String::compareTo);
        System.out.println(names);

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length())
                    return 1;
                else if (o2.length() < o1.length())
                    return -1;
                return 0;
            }
        };
        names.sort(comparator);
        System.out.println(names);
        names.sort(Comparator.reverseOrder());
        System.out.println(names);
        Set<String> setStar = new HashSet<>(names);
        System.out.println(setStar);
        names.sort(String::compareTo);
        String name = names.get(0);
        System.out.println(name);

        List<String> namesList = new ArrayList<>();
        for (String n : names) {
            if (!n.contains("а") && !n.contains("А")) {
                namesList.add(n);
            }
        }
        System.out.println(namesList);
    }
}
