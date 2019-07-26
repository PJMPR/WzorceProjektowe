import model.Drink;
import model.Product;
import model.drink.Beer;
import noReflectionFactory.NoReflectionFactory;
import org.junit.Assert;
import org.junit.Test;
import reflectionFactory.ReflectionFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

public class RegistrationFactoryTestes {

    @Test
    public void checkTimeReflection() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Set<Product> productSet = new HashSet<>();
        ReflectionFactory reflectionFactory = ReflectionFactory.getInstance();
        reflectionFactory.registerType("Drink", Beer.class);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            productSet.add(reflectionFactory.getProduct("Drink"));
        }

        long endTime = System.currentTimeMillis();
    }

    @Test
    public void checkTimeNoReflection() {
        Set<Product> productSet = new HashSet<>();
        NoReflectionFactory noReflectionFactory = NoReflectionFactory.getInstance();
        noReflectionFactory.registerType("Drink", Beer::new);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            productSet.add(noReflectionFactory.getProduct("Drink"));
        }

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
    }
}
