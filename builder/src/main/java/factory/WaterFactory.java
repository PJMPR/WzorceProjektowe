package factory;

import model.Drink;
import model.drinks.Water;

public class WaterFactory implements DrinkFactoryBase {
    @Override
    public Drink getDrink() {
        return new Water();
    }
}
