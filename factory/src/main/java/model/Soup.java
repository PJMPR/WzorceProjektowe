package model;

public abstract class Soup extends Product{
    protected boolean seasonal;

    @Override
    public String order() {
        return "SOUP ORDERED";
    }
}
