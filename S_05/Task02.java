package S_05;

/* Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности. */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
        Map<String, Integer> name = new HashMap<>();
        String human = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";
        String[] people = human.split(" ");
        for (int i = 0; i < people.length; i += 2) {
            if (name.containsKey(people[i])) {
                name.replace(people[i], name.get(people[i]) + 1);
            } else {
                name.put(people[i], 1);
            }
        }
        Map<String, Integer> sorting = new LinkedHashMap<>();
        int max = 1;
        for (int value : name.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : name.entrySet()) {
                String key = entry.getKey();
                if (name.get(key) == i) {
                    sorting.put(key, name.get(key));
                }
            }
        }
        System.out.println(sorting);
    }

}
