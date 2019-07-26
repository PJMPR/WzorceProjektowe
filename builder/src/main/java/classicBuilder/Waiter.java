package classicBuilder;

import model.Drink;

public class Waiter {
    private DrinkBuilder drinkBuilder;

    public Waiter(DrinkBuilder drinkBuilder) {
        this.drinkBuilder = drinkBuilder;
    }

    public void buildDrink() {
        drinkBuilder.buildName();
        drinkBuilder.buildPrice();
        drinkBuilder.buildKcal();
        drinkBuilder.buildSparkling();
        drinkBuilder.buildDescription();
        drinkBuilder.buildCapacity();
        drinkBuilder.buildProductionCountry();
    }

    public Drink getDrink() {
        return this.drinkBuilder.getDrink();
    }
}
