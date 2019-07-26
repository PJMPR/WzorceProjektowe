package model;

public abstract class Drink extends Product{
    protected boolean sparkling;

    @Override
    public String order() {
        return "DRINK ORDERED";
    }
}
