package classicBuilder;

import model.Drink;

public class WaterBuilder implements DrinkBuilder {
    private Drink drink;

    public WaterBuilder() {
        this.drink = new Drink();
    }

    @Override
    public void buildName() {
        this.drink.setName("Water");
    }

    @Override
    public void buildPrice() {
        this.drink.setPrice("3.00");
    }

    @Override
    public void buildKcal() {
        this.drink.setKcal("0");
    }

    @Override
    public void buildSparkling() {
        this.drink.setSparkling(false);
    }

    @Override
    public void buildDescription() {
        this.drink.setDescription("Pure clean water");
    }

    @Override
    public void buildCapacity() {
        this.drink.setCapacity("250");
    }

    @Override
    public void buildProductionCountry() {
        this.drink.setProductionCountry("Poland");
    }

    @Override
    public Drink getDrink() {
        return drink;
    }
}
