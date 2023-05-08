package S_02;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task02 {

    // 2. Реализуйте алгоритм сортировки пузырьком числового массива, результат
    // после каждой итерации запишите в лог-файл.

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task02.class.getName());
        FileHandler fileHand = new FileHandler("S_02/FileToTask02.txt", true);
        logger.addHandler(fileHand);

        // заполнение массива случайными числами
        int[] qwer = new int[10];
        for (int i = 0; i < qwer.length; i++) {
            Random rand = new Random();
            qwer[i] = rand.nextInt(100);
        }
        System.out.printf("Массив: %s\n", Arrays.toString(qwer));

        // Сортировка массива
        int i = 0;
        boolean flag = true;
        while (i < qwer.length - 1) {
            flag = false;
            for (int j = 1; j < qwer.length - i; j++) {
                if (qwer[j - 1] > qwer[j]) {
                    int qw = qwer[j - 1];
                    qwer[j - 1] = qwer[j];
                    qwer[j] = qw;
                    log(Level.INFO, qw);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
            i++;
        }

        System.out.printf("Отсортированный массив: %s\n", Arrays.toString(qwer));
    }

    private static void log(Level info, int qw) {
    }
}