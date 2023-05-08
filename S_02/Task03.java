package S_02;

// 3.* В файле содержится строка с данными:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Task03 {
    public static void main(String[] args) {
        StringBuilder qwer = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("S_02/Journal.txt"))) {
            String qw;
            while ((qw = br.readLine()) != null) {
                qwer.append(qw);
            }
        } catch (IOException per) {
            per.printStackTrace();
        }

        Map<String, String> evaluations = new HashMap<>();

        String[] keys = qwer.toString().replace("{", "").replace("[", "").replace("]", "").replace("\"", "")
                .replaceAll("\\s", "").split("},");

        for (String qw : keys) {
            String[] person = qw.split(",");
            for (String keyValues : person) {
                String[] keyValue = keyValues.replace("}", "").split(":");
                String key = keyValue[0];
                String value = keyValue[1];
                evaluations.put(key, value);
            }
            System.out.printf("Студент %s получил %s по предмету %s.\n", evaluations.get("фамилия"),
                    evaluations.get("оценка"),
                    evaluations.get("предмет"));

        }
    }
}
