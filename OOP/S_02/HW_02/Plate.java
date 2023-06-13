package HW_02;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    boolean reducingFood(int i) {
        int leftoverFood = food - i;
        if (leftoverFood < 0)
            return false;

        food -= i;
        return true;
    }

    void putFood(int food) {
        this.food += food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
