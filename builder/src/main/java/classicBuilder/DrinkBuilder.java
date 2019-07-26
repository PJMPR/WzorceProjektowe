package classicBuilder;

import model.Drink;

public interface DrinkBuilder {
    void buildName();

    void buildPrice();

    void buildKcal();

    void buildSparkling();

    void buildDescription();

    void buildCapacity();

    void buildProductionCountry();

    Drink getDrink();
}
