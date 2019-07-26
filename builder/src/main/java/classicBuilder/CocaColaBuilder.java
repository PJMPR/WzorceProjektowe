package classicBuilder;

import model.Drink;

public class CocaColaBuilder implements DrinkBuilder {
    private Drink drink;

    public CocaColaBuilder() {
        this.drink = new Drink();
    }

    @Override
    public void buildName() {
        this.drink.setName("CocaCola");
    }

    @Override
    public void buildPrice() {
        this.drink.setPrice("5.00");
    }

    @Override
    public void buildKcal() {
        this.drink.setKcal("300");
    }

    @Override
    public void buildSparkling() {
        this.drink.setSparkling(true);
    }

    @Override
    public void buildDescription() {
        this.drink.setDescription("Sparking black drink called CocaCola");
    }

    @Override
    public void buildCapacity() {
        this.drink.setCapacity("500");
    }

    @Override
    public void buildProductionCountry() {
        this.drink.setProductionCountry("UnitedStates");
    }

    @Override
    public Drink getDrink() {
        return drink;
    }
}
