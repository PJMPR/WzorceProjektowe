package model.drink;

import model.Drink;

public class CocaCola extends Drink {
    public CocaCola() {
        name = "Coca Cola";
        kcal = 500;
        sparkling = true;
    }

    @Override
    public String order() {
        return "COCACOLA ORDERED";
    }
}
