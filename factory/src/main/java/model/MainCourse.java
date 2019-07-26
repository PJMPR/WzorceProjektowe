package model;

public abstract class MainCourse extends Product {
    protected boolean vegan;

    @Override
    public String order() {
        return "MAIN COURSE ORDERED";
    }

}
