package S_05;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        phoneBook.put("Igor", List.of("8 926 333 55 63", "8 926 222 22 99"));
        phoneBook.put("Ira", List.of("8 926 333 41 55", "8 926 222 22 00"));
        phoneBook.put("Igor", List.of("8 926 333 55 63", "8 926 222 22 44"));
        phoneBook.put("Petr", List.of("8 926 666 33 77", "8 926 222 22 11"));

        menu(phoneBook);

    }

    public static String scanner() {
        Scanner qwer = new Scanner(System.in);
        String scan = qwer.nextLine();
        return scan;
    }

    public static void search(Map<String, List<String>> phoneBook) {
        System.out.println("Введите имя: ");
        String name = scanner();
        System.out.println(phoneBook.get(name));
    }

    public static void Book(Map<String, List<String>> phoneBook) {
        System.out.println(phoneBook);

    }

    public static Map<String, List<String>> add(Map<String, List<String>> phoneBook) {
        System.out.println("Для выхода введите 'stop'");
        System.out.println("Введите имя: ");
        String name = scanner();
        List<String> number = new ArrayList<>();
        while (true) {
            System.out.println("Введите номер: ");
            String phone = scanner();
            if (phone.equals("stop")) {
                break;
            } else {
                number.add(phone);
            }
        }
        phoneBook.put(name, number);

        return phoneBook;
    }

    public static Map<String, List<String>> menu(Map<String, List<String>> phoneBook) {
        System.out.println(
                "Введите команду: search - найти контакт, add - добавить контакт, all - показать всю телефонную книгу, exit - закончить");
        while (true) {
            String qw = scanner();
            if (qw.equals("exit")) {
                break;
            } else {
                switch (qw) {
                    case "search":
                        search(phoneBook);
                        break;
                    case "add":
                        add(phoneBook);
                        break;
                    case "all":
                        Book(phoneBook);
                        break;
                    default:
                        break;
                }
            }
        }
        return phoneBook;
    }
}