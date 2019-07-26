package orderApp.methodFactory;

import orderApp.model.Meal;
import orderApp.model.veganMeals.Beans;
import orderApp.model.veganMeals.VeganBurger;
import orderApp.model.veganMeals.VeganChop;

public class VeganMealFactory extends MethodFactory {
    private static VeganMealFactory instance;

    private VeganMealFactory() {

    }

    public static synchronized VeganMealFactory getInstance() {
        if (instance == null) {
            instance = new VeganMealFactory();
        }

        return instance;
    }

    @Override
    public Meal getMeal(int mealNumber) {
        switch (mealNumber) {
            case 1:
                return new VeganBurger();
            case 2:
                return new VeganChop();
            case 3:
                return new Beans();
            default:
                System.out.println("Niepoprawny posiłek");
        }
        return null;
    }
}
