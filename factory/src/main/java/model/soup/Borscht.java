package model.soup;

import model.Soup;

public class Borscht extends Soup {

    public Borscht() {
        name = "Borscht";
        kcal = 300;
        seasonal = false;
    }

    @Override
    public String order() {
        return "BORSCHT ORDERED";
    }
}
