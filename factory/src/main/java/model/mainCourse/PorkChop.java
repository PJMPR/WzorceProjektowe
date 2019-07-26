package model.mainCourse;

import model.MainCourse;

public class PorkChop extends MainCourse {
    public PorkChop() {
        name = "Pork Chop";
        kcal = 850;
        vegan = false;
    }

    @Override
    public String order() {
        return "PORKCHOP ORDERED";
    }
}
