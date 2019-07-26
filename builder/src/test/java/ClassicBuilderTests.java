import classicBuilder.CocaColaBuilder;
import model.Drink;
import classicBuilder.Waiter;
import classicBuilder.WaterBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;

public class ClassicBuilderTests {

    @Test
    public void checkIfClassicBuilderWorksCorrectForCocaCola() {
        CocaColaBuilder cocaColaBuilder = new CocaColaBuilder();

        Waiter waiter = new Waiter(cocaColaBuilder);
        waiter.buildDrink();
        Drink cocacola = waiter.getDrink();

        System.out.println(cocacola);

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

    @Test
    public void checkIfClassicBuilderWorksCorrectForWater() {
        WaterBuilder waterBuilder = new WaterBuilder();

        Waiter waiter = new Waiter(waterBuilder);
        waiter.buildDrink();
        Drink water = waiter.getDrink();

        System.out.println(water);

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
}
