package orderApp.model;

public abstract class Meal {
    protected int mealNumber;
    protected String name;
    protected double price;

    public abstract Meal order();

    @Override
    public String toString() {
        return "~Proszę, oto " + name;
    }
}
