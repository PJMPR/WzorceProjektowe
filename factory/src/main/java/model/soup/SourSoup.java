package model.soup;

import model.Soup;

public class SourSoup extends Soup {
    public SourSoup() {
        name = "Sour Soup";
        kcal = 400;
        seasonal = false;
    }

    @Override
    public String order() {
        return "SOURSOUP ORDERED";
    }
}
