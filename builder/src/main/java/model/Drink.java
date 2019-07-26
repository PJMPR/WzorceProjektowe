package model;

public class Drink {
    protected String name;
    protected String price;
    protected String kcal;
    protected boolean sparkling;
    protected String description;
    protected String capacity;
    protected String productionCountry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getKcal() {
        return kcal;
    }

    public void setKcal(String kcal) {
        this.kcal = kcal;
    }

    public boolean isSparkling() {
        return sparkling;
    }

    public void setSparkling(boolean sparkling) {
        this.sparkling = sparkling;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", kcal='" + kcal + '\'' +
                ", sparkling=" + sparkling +
                ", description='" + description + '\'' +
                ", capacity='" + capacity + '\'' +
                ", productionCountry='" + productionCountry + '\'' +
                '}';
    }
}
