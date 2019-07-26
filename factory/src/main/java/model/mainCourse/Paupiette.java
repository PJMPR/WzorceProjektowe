package model.mainCourse;

import model.MainCourse;

public class Paupiette extends MainCourse {

    public Paupiette() {
        name = "Paupiette";
        kcal = 600;
        vegan = false;
    }

    @Override
    public String order() {
        return "PAUPIETTE ORDERED";
    }
}
