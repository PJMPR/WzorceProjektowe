package orderApp.methodFactory;

import orderApp.model.Meal;
import orderApp.model.classicMeals.Broth;
import orderApp.model.classicMeals.Chop;
import orderApp.model.classicMeals.Spaghetti;

public class ClassicMealFactory extends MethodFactory {
    private static ClassicMealFactory instance;

    private ClassicMealFactory() {

    }

    public static synchronized ClassicMealFactory getInstance() {
        if (instance == null) {
            instance = new ClassicMealFactory();
        }
        return instance;
    }


    @Override
    public Meal getMeal(int mealNumber) {
        switch (mealNumber) {
            case 1:
                return new Spaghetti();
            case 2:
                return new Chop();
            case 3:
                return new Broth();
            default:
                System.out.println("Niepoprawny wybór posiłku");
        }
        return null;
    }
}
