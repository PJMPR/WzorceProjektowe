package model;

public abstract class Product {

    protected String name;
    protected short kcal;

    public abstract String order();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getKcal() {
        return kcal;
    }

    public void setKcal(short kcal) {
        this.kcal = kcal;
    }
}
