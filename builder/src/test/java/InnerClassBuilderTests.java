import innerClassBuilder.Drink;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;

public class InnerClassBuilderTests {

    @Test
    public void checkIfInnerClassBuilderWorksCorrect() {
        Drink drink = new Drink.DrinkBuilder()
                .buildName("CocaCola")
                .buildPrice("5.00")
                .buildKcal("300")
                .buildSparkling(true)
                .buildDescription("Sparking black drink called CocaCola")
                .buildCapacity("500")
                .buildProductionCountry("UnitedStates")
                .build();

                assertAll(
                        () -> Assertions.assertEquals("CocaCola", drink.getName()),
                        () -> Assertions.assertEquals("5.00", drink.getPrice()),
                        () -> Assertions.assertEquals("300", drink.getKcal()),
                        () -> Assertions.assertTrue(drink.isSparkling()),
                        () -> Assertions.assertEquals("Sparking black drink called CocaCola", drink.getDescription()),
                        () -> Assertions.assertEquals("500", drink.getCapacity()),
                        () -> Assertions.assertEquals("UnitedStates", drink.getProductionCountry())
                );
    }
}
