import methodFactory.DrinkMethodFactory;
import methodFactory.MainCourseMethodFactory;
import methodFactory.MethodFactory;
import methodFactory.SoupMethodFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class MethodFactoryTests {

    @Test
    public void checkIfDrinkFactoryIsSingleton() {
        HashSet<Integer> singletons = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            DrinkMethodFactory singleton = DrinkMethodFactory.getInstance();
            DrinkMethodFactory singleton2 = DrinkMethodFactory.getInstance();
            singletons.add(singleton.hashCode());
            singletons.add(singleton2.hashCode());
        }
        Assert.assertEquals(1, singletons.size());
    }

    @Test
    public void checkIfSoupFactoryIsSingleton() {
        HashSet<Integer> singletons = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            SoupMethodFactory singleton = SoupMethodFactory.getInstance();
            SoupMethodFactory singleton2 = SoupMethodFactory.getInstance();
            singletons.add(singleton.hashCode());
            singletons.add(singleton2.hashCode());
        }
        Assert.assertEquals(1, singletons.size());
    }

    @Test
    public void checkIfMainCourseFactoryIsSingleton() {
        HashSet<Integer> singletons = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            MainCourseMethodFactory singleton = MainCourseMethodFactory.getInstance();
            MainCourseMethodFactory singleton2 = MainCourseMethodFactory.getInstance();
            singletons.add(singleton.hashCode());
            singletons.add(singleton2.hashCode());
        }
        Assert.assertEquals(1, singletons.size());
    }

    @Test
    public void checkIfDrinkOrdered() {
        MethodFactory drink = DrinkMethodFactory.getInstance();
        String receivedMessage = drink.orderProduct("Beer");
        String expectedMessage = "BEER ORDERED";

        Assert.assertEquals(expectedMessage, receivedMessage);
    }

    @Test
    public void checkIfSoupOrdered() {
        MethodFactory soup = SoupMethodFactory.getInstance();
        String receivedMessage = soup.orderProduct("Borscht");
        String expectedMessage = "BORSCHT ORDERED";

        Assert.assertEquals(expectedMessage, receivedMessage);
    }

    @Test
    public void checkIfMainCourseOrdered() {
        MethodFactory mainCourse = MainCourseMethodFactory.getInstance();
        String receivedMessage = mainCourse.orderProduct("Pizza");
        String expectedMessage = "PIZZA ORDERED";

        Assert.assertEquals(expectedMessage, receivedMessage);
    }

    @Test
    public void checkIfAllProductsOrdered() {
        MethodFactory drink = DrinkMethodFactory.getInstance();
        MethodFactory soup = SoupMethodFactory.getInstance();
        MethodFactory mainCourse = MainCourseMethodFactory.getInstance();

        String receivedDrinkMessage = drink.orderProduct("Beer");
        String receivedMainCourseMessage = mainCourse.orderProduct("Pizza");
        String receivedSoupMessage = soup.orderProduct("Borscht");

        String expectedDrinkMessage = "BEER ORDERED";
        String expectedSoupMessage = "BORSCHT ORDERED";
        String expectedMainCourseMessage = "PIZZA ORDERED";

        Assert.assertEquals(expectedDrinkMessage, receivedDrinkMessage);
        Assert.assertEquals(expectedSoupMessage, receivedSoupMessage);
        Assert.assertEquals(expectedMainCourseMessage, receivedMainCourseMessage);
    }
}
