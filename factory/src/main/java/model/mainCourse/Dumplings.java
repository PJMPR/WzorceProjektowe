package model.mainCourse;

import model.MainCourse;

public class Dumplings extends MainCourse {
    public Dumplings() {
        name = "Dumplings";
        kcal = 700;
        vegan = true;
    }

    @Override
    public String order() {
        return "DUMPLINGS ORDERED";
    }

}
