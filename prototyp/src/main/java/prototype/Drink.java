package prototype;

public class Drink implements Cloneable {
    private String drinkName;

    public Drink(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "drinkName='" + drinkName + '\'' +
                '}';
    }

    @Override
    protected Drink clone() throws CloneNotSupportedException {
        return (Drink) super.clone();
    }
}
