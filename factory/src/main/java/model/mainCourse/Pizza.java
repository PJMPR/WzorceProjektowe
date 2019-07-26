package model.mainCourse;

import model.MainCourse;

public class Pizza extends MainCourse {

    public Pizza() {
        name = "Pizza";
        kcal = 1500;
        vegan = false;
    }

    @Override
    public String order() {
        return "PIZZA ORDERED";
    }
}
