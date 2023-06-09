public class Chocolate extends Product {

    private int calories;

    public double getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Chocolate(String brand, String name, double price, int calories) {
        super(brand, name, price);
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return String.format("[Плитка] %s - %s - %f [калории: %d]", brand, name, price, calories);
    }
}
