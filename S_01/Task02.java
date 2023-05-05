// Вывести все простые числа от 1 до 1000

package S_01;

public class Task02 {
    public static void main(String[] args) {

        boolean q = true;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    q = false;
                    break;
                }
            }
            if (q)
                System.out.print(i + " ");
            else
                q = true;

        }
    }
}
