import classicBuilder.CocaColaBuilder;
import classicBuilder.Waiter;
import classicBuilder.WaterBuilder;
import factory.CocaColaFactory;
import factory.DrinkMaker;
import factory.WaterFactory;
import model.Drink;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;

public class BuilderBetterThanFactoryTests {

    @Test
    public void orderDrinkWithFactory() {
        DrinkMaker drinkMaker = new DrinkMaker();

        Drink cocaCola = drinkMaker.orderDrink(new CocaColaFactory());
        Drink water = drinkMaker.orderDrink(new WaterFactory());

        assertAll(
                () -> Assertions.assertEquals("CocaCola", cocaCola.getName()),
                () -> Assertions.assertEquals("5.00", cocaCola.getPrice()),
                () -> Assertions.assertEquals("300", cocaCola.getKcal()),
                () -> Assertions.assertTrue(cocaCola.isSparkling()),
                () -> Assertions.assertEquals("Sparking black drink called CocaCola", cocaCola.getDescription()),
                () -> Assertions.assertEquals("500", cocaCola.getCapacity()),
                () -> Assertions.assertEquals("UnitedStates", cocaCola.getProductionCountry())
        );

        assertAll(
                () -> Assertions.assertEquals("Water", water.getName()),
                () -> Assertions.assertEquals("3.00", water.getPrice()),
                () -> Assertions.assertEquals("0", water.getKcal()),
                () -> Assertions.assertFalse(water.isSparkling()),
                () -> Assertions.assertEquals("Pure clean water", water.getDescription()),
                () -> Assertions.assertEquals("250", water.getCapacity()),
                () -> Assertions.assertEquals("Poland", water.getProductionCountry())
        );
    }

    @Test
    public void orderDrinkWithBuilder() {
        CocaColaBuilder cocaColaBuilder = new CocaColaBuilder();
        WaterBuilder waterBuilder = new WaterBuilder();

        Waiter waiter = new Waiter(cocaColaBuilder);
        waiter.buildDrink();
        Drink cocacola = waiter.getDrink();

        waiter = new Waiter(waterBuilder);
        waiter.buildDrink();
        Drink water = waiter.getDrink();


        assertAll(
                () -> Assertions.assertEquals("Water", water.getName()),
                () -> Assertions.assertEquals("3.00", water.getPrice()),
                () -> Assertions.assertEquals("0", water.getKcal()),
                () -> Assertions.assertFalse(water.isSparkling()),
                () -> Assertions.assertEquals("Pure clean water", water.getDescription()),
                () -> Assertions.assertEquals("250", water.getCapacity()),
                () -> Assertions.assertEquals("Poland", water.getProductionCountry())
        );

        assertAll(
                () -> Assertions.assertEquals("CocaCola", cocacola.getName()),
                () -> Assertions.assertEquals("5.00", cocacola.getPrice()),
                () -> Assertions.assertEquals("300", cocacola.getKcal()),
                () -> Assertions.assertTrue(cocacola.isSparkling()),
                () -> Assertions.assertEquals("Sparking black drink called CocaCola", cocacola.getDescription()),
                () -> Assertions.assertEquals("500", cocacola.getCapacity()),
                () -> Assertions.assertEquals("UnitedStates", cocacola.getProductionCountry())
        );
    }


}
