package abstractFactory;

import model.Drink;
import model.MainCourse;
import model.Soup;

public interface AbstractFactory {
    Drink orderDrink();

    MainCourse orderMainCourse();

    Soup orderSoup();
}
