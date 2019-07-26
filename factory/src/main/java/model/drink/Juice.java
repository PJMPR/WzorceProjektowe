package model.drink;

import model.Drink;

public class Juice extends Drink {
    public Juice() {
        name = "Juice";
        kcal = 200;
        sparkling = false;
    }

    @Override
    public String order() {
        return "JUICE ORDERED";
    }
}
