package prototype;

import java.util.HashMap;
import java.util.Map;

public class MealManager {
    private Map<String, Meal> mealPrototypes = new HashMap<>();

    {
        mealPrototypes.put("studentMeal",
                new Meal("studentMeal",
                        new Food("cheapFood",
                                new MainCourse("Pizza"),
                                new Soup("Broth")),
                        new Drink("CocaCola")));

        mealPrototypes.put("bussinesMeal",
                new Meal("bussinesMeal",
                        new Food("expensiveFood",
                                new MainCourse("Caviar"),
                                new Soup("SourSoup")),
                        new Drink("Wine")));

        mealPrototypes.put("customMeal",
                new Meal("customMeal",
                        new Food("neutralFood",
                                new MainCourse("Chop"),
                                new Soup("Borscht")),
                        new Drink("Water")));
    }

    public Meal getMealPrototypes(String type) throws CloneNotSupportedException {
        return (Meal) mealPrototypes.get(type).clone();
    }

    public Meal getMealDeepCopy(String type) throws CloneNotSupportedException {
        return mealPrototypes.get(type).deepClone();
    }
}
