package srp2;

import java.util.Scanner;

public class SetValue {
    private static Scanner scanner = new Scanner(System.in);
    Order order;

    public SetValue(Order order) {
        this.order = order;
    }

    private String prompt(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public void inputFromConsole() {
        order.setClientName(prompt("Имя клиента: "));
        order.setProduct(prompt("Продукт: "));
        order.setQnt(Integer.parseInt(prompt("Кол-во: ")));
        order.setPrice(Integer.parseInt(prompt("Цена: ")));
    }

}
