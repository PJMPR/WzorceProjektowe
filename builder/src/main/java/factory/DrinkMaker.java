package factory;

import model.Drink;

public class DrinkMaker {
    public Drink orderDrink(DrinkFactoryBase drinkFactoryBase) {
        return drinkFactoryBase.getDrink();
    }
}
