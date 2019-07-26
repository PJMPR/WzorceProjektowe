import abstractFactory.BusinessFactory;
import abstractFactory.Meal;
import abstractFactory.RandomPersonFactory;
import abstractFactory.StudentFactory;
import model.Drink;
import model.MainCourse;
import model.Soup;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class AbstractFactoryTestes {

    @Test
    public void checkIfStudentFactoryIsSingleton() {
        HashSet<Integer> singletons = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            StudentFactory singleton = StudentFactory.getInstance();
            StudentFactory singleton2 = StudentFactory.getInstance();
            singletons.add(singleton.hashCode());
            singletons.add(singleton2.hashCode());
        }
        Assert.assertEquals(1, singletons.size());
    }

    @Test
    public void checkIfBusinessFactoryIsSingleton() {
        HashSet<Integer> singletons = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            BusinessFactory singleton = BusinessFactory.getInstance();
            BusinessFactory singleton2 = BusinessFactory.getInstance();
            singletons.add(singleton.hashCode());
            singletons.add(singleton2.hashCode());
        }
        Assert.assertEquals(1, singletons.size());
    }

    @Test
    public void checkIfRandomPersonFactoryIsSingleton() {
        HashSet<Integer> singletons = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            RandomPersonFactory singleton = RandomPersonFactory.getInstance();
            RandomPersonFactory singleton2 = RandomPersonFactory.getInstance();
            singletons.add(singleton.hashCode());
            singletons.add(singleton2.hashCode());
        }
        Assert.assertEquals(1, singletons.size());
    }

    @Test
    public void checkIfStudentOrdered() {
        Meal studentMeal = new Meal(StudentFactory.getInstance());
        Drink drink = studentMeal.orderDrink();
        Soup soup = studentMeal.orderSoup();
        MainCourse mainCourse = studentMeal.orderMainCourse();

        String receivedDrinkMessage = drink.order();
        String receivedMainCourseMessage = mainCourse.order();
        String receivedSoupMessage = soup.order();

        String expectedDrinkMessage = "BEER ORDERED";
        String expectedSoupMessage = "BROTH ORDERED";
        String expectedMainCourseMessage = "KEBAB ORDERED";

        Assert.assertEquals(expectedDrinkMessage, receivedDrinkMessage);
        Assert.assertEquals(expectedSoupMessage, receivedSoupMessage);
        Assert.assertEquals(expectedMainCourseMessage, receivedMainCourseMessage);
    }

    @Test
    public void checkIfRandomPersonOrdered() {
        Meal randomPersonMeal = new Meal(RandomPersonFactory.getInstance());
        Drink drink = randomPersonMeal.orderDrink();
        Soup soup = randomPersonMeal.orderSoup();
        MainCourse mainCourse = randomPersonMeal.orderMainCourse();

        String receivedDrinkMessage = drink.order();
        String receivedMainCourseMessage = mainCourse.order();
        String receivedSoupMessage = soup.order();

        String expectedDrinkMessage = "JUICE ORDERED";
        String expectedSoupMessage = "TOMATOESOUP ORDERED";
        String expectedMainCourseMessage = "DUMPLINGS ORDERED";

        Assert.assertEquals(expectedDrinkMessage, receivedDrinkMessage);
        Assert.assertEquals(expectedSoupMessage, receivedSoupMessage);
        Assert.assertEquals(expectedMainCourseMessage, receivedMainCourseMessage);
    }

    @Test
    public void checkIfBusinessOrdered() {
        Meal businessMeal = new Meal(BusinessFactory.getInstance());
        Drink drink = businessMeal.orderDrink();
        Soup soup = businessMeal.orderSoup();
        MainCourse mainCourse = businessMeal.orderMainCourse();

        String receivedDrinkMessage = drink.order();
        String receivedMainCourseMessage = mainCourse.order();
        String receivedSoupMessage = soup.order();

        String expectedDrinkMessage = "WINE ORDERED";
        String expectedSoupMessage = "SOURSOUP ORDERED";
        String expectedMainCourseMessage = "PAUPIETTE ORDERED";

        Assert.assertEquals(expectedDrinkMessage, receivedDrinkMessage);
        Assert.assertEquals(expectedSoupMessage, receivedSoupMessage);
        Assert.assertEquals(expectedMainCourseMessage, receivedMainCourseMessage);
    }
}
