package factory;

import model.drinks.CocaCola;
import model.Drink;

public class CocaColaFactory implements DrinkFactoryBase {
    @Override
    public Drink getDrink() {
        return new CocaCola();
    }
}
