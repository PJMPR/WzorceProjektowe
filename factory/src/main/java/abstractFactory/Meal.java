package abstractFactory;

import model.Drink;
import model.MainCourse;
import model.Soup;

public class Meal {
    private AbstractFactory abstractFactory;

    public Meal(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public Drink orderDrink() {
        return abstractFactory.orderDrink();
    }

    public Soup orderSoup() {
        return abstractFactory.orderSoup();
    }

    public MainCourse orderMainCourse() {
        return abstractFactory.orderMainCourse();
    }
}
