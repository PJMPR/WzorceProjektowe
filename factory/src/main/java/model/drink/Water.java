package model.drink;

import model.Drink;

public class Water extends Drink {
    public Water() {
        name = "Water";
        kcal = 0;
        sparkling = false;
    }

    @Override
    public String order() {
        return "WATER ORDERED";
    }
}
