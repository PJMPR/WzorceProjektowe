package abstractFactory;

import model.Drink;
import model.MainCourse;
import model.Soup;
import model.drink.Juice;
import model.mainCourse.Dumplings;
import model.soup.TomatoeSoup;

public class RandomPersonFactory implements AbstractFactory {
    private static RandomPersonFactory instance;

    private RandomPersonFactory() {
    }

    public static synchronized RandomPersonFactory getInstance() {
        if (instance == null) {
            instance = new RandomPersonFactory();
        }
        return instance;
    }

    @Override
    public Drink orderDrink() {
        return new Juice();
    }

    @Override
    public MainCourse orderMainCourse() {
        return new Dumplings();
    }

    @Override
    public Soup orderSoup() {
        return new TomatoeSoup();
    }
}
