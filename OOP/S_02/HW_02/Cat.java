package HW_02;

public class Cat {
    private String name;
    private int appetite;
    private boolean hunger;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hunger = true;
    }

    public void info() {
        String isHungr = !hunger ? "сытый" : "голодный";
        System.out.println(name + ": " + isHungr);
    }

    public void eat(Plate plate) {
        if (hunger && plate.reducingFood(appetite))
            hunger = false;
    }
}
