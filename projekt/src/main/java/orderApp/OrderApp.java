package orderApp;

import orderApp.templateMethod.ClassicOrderMealSequence;
import orderApp.templateMethod.OrderMealSequence;
import orderApp.templateMethod.VeganOrderMealSequence;
import orderApp.utils.Menu;

import java.util.Scanner;

class OrderApp {
    private OrderMealSequence orderMealSequence;

    void startApplication() {
        Menu.printWelcomeInfo();
        prepareSequenceForGuest();
        orderMealSequence.orderMeal();
    }

    private void prepareSequenceForGuest() {
        Scanner scanner = new Scanner(System.in);
        boolean vegan = scanner.nextBoolean();
        if (vegan)
            orderMealSequence = new VeganOrderMealSequence();
        else
            orderMealSequence = new ClassicOrderMealSequence();
    }
}
