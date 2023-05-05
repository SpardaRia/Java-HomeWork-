package S_01;

//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.printf("Введите число: ");
        Scanner nummber = new Scanner(System.in);
        int n = nummber.nextInt();
        int triangularNumber = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            triangularNumber += i;
            factorial *= i;
        }
        System.out.printf("Сумма от 1 до %d равно %d%n", n, triangularNumber);
        System.out.printf("Произведение от 1 до %d равно %d%n", n, factorial);
        nummber.close();
    }
}