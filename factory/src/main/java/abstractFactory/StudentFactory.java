package abstractFactory;

import model.Drink;
import model.MainCourse;
import model.Soup;
import model.drink.Beer;
import model.mainCourse.Kebab;
import model.soup.Broth;

public class StudentFactory implements AbstractFactory {
    private static StudentFactory instance;

    private StudentFactory() {
    }

    public static synchronized StudentFactory getInstance() {
        if (instance == null) {
            instance = new StudentFactory();
        }
        return instance;
    }

    @Override
    public Drink orderDrink() {
        return new Beer();
    }

    @Override
    public MainCourse orderMainCourse() {
        return new Kebab();
    }

    @Override
    public Soup orderSoup() {
        return new Broth();
    }
}
