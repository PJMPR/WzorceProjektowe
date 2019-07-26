package model.drink;

import model.Drink;

public class Beer extends Drink {

    public Beer() {
        name = "Beer";
        kcal = 300;
        sparkling = true;
    }

    @Override
    public String order() {
        return "BEER ORDERED";
    }
}
