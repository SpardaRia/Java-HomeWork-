package S_03;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task03 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            number.add(i, random.nextInt(100));
        }

        double qwert = getAverage(number);

        System.out.println(number);
        System.out.printf("Минимально число: %d\n", Collections.min(number));
        System.out.printf("Максимальное число: %d\n", Collections.max(number));
        System.out.printf("Среднее арифметическое списка: %.1f\n", qwert);
    }

    private static double getAverage(List<Integer> list) {
        IntSummaryStatistics stats = list.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));
        return stats.getAverage();
    }
}
