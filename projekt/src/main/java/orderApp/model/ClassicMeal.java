package orderApp.model;

public abstract class ClassicMeal extends Meal {

    @Override
    public Meal order() {
        return this;
    }
}
