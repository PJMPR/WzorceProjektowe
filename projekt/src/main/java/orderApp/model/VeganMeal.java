package orderApp.model;

public abstract class VeganMeal extends Meal {
    @Override
    public Meal order() {
        return this;
    }
}
