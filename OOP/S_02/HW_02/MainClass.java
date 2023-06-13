package HW_02;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = { new Cat("Barsik", 5),
                new Cat("Murka", 80),
                new Cat("Vasya", 25),
                new Cat("Olympia", 50),
                new Cat("Kazuha", 10),
                new Cat("Scaramouche", 9) };

        Plate plate = new Plate(50);
        plate.info();

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}
