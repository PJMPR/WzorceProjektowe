package model.soup;

import model.Soup;

public class Broth extends Soup {
    public Broth() {
        name = "Broth";
        kcal = 500;
        seasonal = false;
    }

    @Override
    public String order() {
        return "BROTH ORDERED";
    }
}
