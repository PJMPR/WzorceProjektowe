package prototype;

public class Meal implements Cloneable {
    private String mealName;
    private Food food;
    private Drink drink;

    public Meal(String mealName, Food food, Drink drink) {
        this.mealName = mealName;
        this.food = food;
        this.drink = drink;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mealName='" + mealName + '\'' +
                ", food=" + food +
                ", drink=" + drink +
                '}';
    }

    @Override
    protected Meal clone() throws CloneNotSupportedException {
        return (Meal) super.clone();
    }

    protected Meal deepClone() throws CloneNotSupportedException {
        Meal meal = (Meal) super.clone();
        meal.food = food.clone();
        meal.drink = drink.clone();
        return meal;
    }
}
