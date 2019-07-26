package model.drink;

import model.Drink;

public class Wine extends Drink {
    public Wine() {
        name = "Wine";
        kcal = 250;
        sparkling = false;
    }

    @Override
    public String order() {
        return "WINE ORDERED";
    }
}
