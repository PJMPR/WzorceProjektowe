package abstractFactory;

import model.Drink;
import model.MainCourse;
import model.Soup;
import model.drink.Wine;
import model.mainCourse.Paupiette;
import model.soup.SourSoup;

public class BusinessFactory implements AbstractFactory {
    private static BusinessFactory instance;

    private BusinessFactory() {
    }

    public static synchronized BusinessFactory getInstance() {
        if (instance == null) {
            instance = new BusinessFactory();
        }
        return instance;
    }

    @Override
    public Drink orderDrink() {
        return new Wine();
    }

    @Override
    public MainCourse orderMainCourse() {
        return new Paupiette();
    }

    @Override
    public Soup orderSoup() {
        return new SourSoup();
    }
}
