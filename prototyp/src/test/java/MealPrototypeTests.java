
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import prototype.Meal;
import prototype.MealManager;

import static org.junit.jupiter.api.Assertions.*;


public class MealPrototypeTests {

    private MealManager mealManager;

    @BeforeEach
    public void setUp() {
        mealManager = new MealManager();
    }

    @Test
    public void checkIfCloneWorksForMeal() throws CloneNotSupportedException {
        Meal studentMeal = mealManager.getMealPrototypes("studentMeal");
        Meal studentMeal2 = mealManager.getMealPrototypes("studentMeal");

        assertAll(
                () -> assertNotEquals(studentMeal, studentMeal2),
                () -> assertEquals(studentMeal.getDrink(), studentMeal2.getDrink()),
                () -> assertEquals(studentMeal.getFood(), studentMeal2.getFood()),
                () -> assertEquals(studentMeal.getFood().getMainCourse(), studentMeal2.getFood().getMainCourse()),
                () -> assertEquals(studentMeal.getFood().getSoup(), studentMeal2.getFood().getSoup()),

                () -> assertEquals("cheapFood", studentMeal.getFood().getFoodName()),
                () -> assertEquals("cheapFood", studentMeal2.getFood().getFoodName())
        );


    }

    @Test
    public void checkIfDeepCloneWorksForMeal() throws CloneNotSupportedException {
        Meal studentMeal = mealManager.getMealDeepCopy("studentMeal");
        Meal studentMeal2 = mealManager.getMealDeepCopy("studentMeal");

        assertAll(
                () -> assertNotEquals(studentMeal, studentMeal2),
                () -> assertNotEquals(studentMeal.getDrink(), studentMeal2.getDrink()),
                () -> assertNotEquals(studentMeal.getFood(), studentMeal2.getFood()),
                () -> assertNotEquals(studentMeal.getFood().getMainCourse(), studentMeal2.getFood().getMainCourse()),
                () -> assertNotEquals(studentMeal.getFood().getSoup(), studentMeal2.getFood().getSoup()),

                () -> assertEquals("cheapFood", studentMeal.getFood().getFoodName()),
                () -> assertEquals("cheapFood", studentMeal2.getFood().getFoodName())
        );
    }
}
