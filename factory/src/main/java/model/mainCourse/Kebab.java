package model.mainCourse;

import model.MainCourse;

public class Kebab extends MainCourse {
    public Kebab() {
        name = "Kebab";
        kcal = 900;
        vegan = false;
    }

    @Override
    public String order() {
        return "KEBAB ORDERED";
    }
}
