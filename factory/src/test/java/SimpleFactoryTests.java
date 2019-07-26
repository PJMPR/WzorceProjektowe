import model.Drink;
import model.MainCourse;
import model.Soup;
import org.junit.Assert;
import org.junit.Test;
import simpleFactory.SimpleProductFactory;

import java.util.HashSet;

public class SimpleFactoryTests {

    @Test
    public void checkIfSimpleFactoryIsSingleton() {
        HashSet<Integer> singletons = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            SimpleProductFactory singleton = SimpleProductFactory.getInstance();
            SimpleProductFactory singleton2 = SimpleProductFactory.getInstance();
            singletons.add(singleton.hashCode());
            singletons.add(singleton2.hashCode());
        }
        Assert.assertEquals(1, singletons.size());
    }

    @Test
    public void checkIfDrinkOrdered() {
        SimpleProductFactory factory = SimpleProductFactory.getInstance();
        Drink drink = factory.orderDrink("Beer");

        String expectedMessage = "BEER ORDERED";
        Assert.assertEquals(expectedMessage, drink.order());
    }

    @Test
    public void checkIfSoupOrdered() {
        SimpleProductFactory factory = SimpleProductFactory.getInstance();
        Soup soup = factory.orderSoup("Borscht");

        String expectedMessage = "BORSCHT ORDERED";
        Assert.assertEquals(expectedMessage, soup.order());
    }

    @Test
    public void checkIfMainCourseOrdered() {
        SimpleProductFactory factory = SimpleProductFactory.getInstance();
        MainCourse mainCourse = factory.orderMainCource("Pizza");

        String expectedMessage = "PIZZA ORDERED";
        Assert.assertEquals(expectedMessage, mainCourse.order());
    }

    @Test
    public void checkAllProductsOrdered() {
        SimpleProductFactory factory = SimpleProductFactory.getInstance();
        Drink drink = factory.orderDrink("Beer");
        MainCourse mainCourse = factory.orderMainCource("Pizza");
        Soup soup = factory.orderSoup("Borscht");

        String expectedDrinkMessage = "BEER ORDERED";
        String expectedMainCourseMessage = "PIZZA ORDERED";
        String expectedSoupMessage = "BORSCHT ORDERED";

        Assert.assertEquals(expectedDrinkMessage, drink.order());
        Assert.assertEquals(expectedMainCourseMessage, mainCourse.order());
        Assert.assertEquals(expectedSoupMessage, soup.order());
    }
}
