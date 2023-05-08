package S_02;

// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос. 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) throws IOException {

        // Читаем текстовый файл и записываем его в новый
        StringBuilder newFile = new StringBuilder();
        try (BufferedReader qwer = new BufferedReader(new FileReader("S_02/Text.txt"))) {
            String str;
            while ((str = qwer.readLine()) != null) {
                newFile.append(str);
            }
        } catch (IOException qw) {
            qw.printStackTrace();
        }

        // Избавляемся от лишних символов
        Map<String, String> newStringFanal = new HashMap<>();
        String[] keys = newFile.toString().replace("{", "").replace("\"", "").replace("}", "").replaceAll("\\s", "")
                .split(",");
        for (String str : keys) {
            String[] keyValue = str.split(":");
            String key = keyValue[0];
            String value = keyValue[1];
            newStringFanal.put(key, value);
        }
        System.out.println(newStringFanal);

        // Вывод результата в консоль
        String name = newStringFanal.get("name");
        String country = newStringFanal.get("country");
        String city = newStringFanal.get("city");
        System.out.printf("SELECT * FROM students WHERE name = %s AND country = %s AND city = %s", name, country, city);

    }
}