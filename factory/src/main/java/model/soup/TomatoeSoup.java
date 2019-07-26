package model.soup;

import model.Soup;

public class TomatoeSoup extends Soup {
    public TomatoeSoup() {
        name = "Tomatoe Soup";
        kcal = 400;
        seasonal = false;
    }

    @Override
    public String order() {
        return "TOMATOESOUP ORDERED";
    }
}
