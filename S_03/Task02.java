// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

package S_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            number.add(i, random.nextInt(10));
        }

        System.out.println(number);

        for (int j = 0; j < number.size(); j++) {
            if (number.get(j) % 2 == 0)
                number.remove(j--);
        }

        System.out.println(number);
    }
}
