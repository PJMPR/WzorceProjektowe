package orderApp.templateMethod;

import orderApp.enums.OrderStatus;
import orderApp.fasada.MobileBankAppFacade;
import orderApp.model.Order;

import java.util.Scanner;

public abstract class OrderMealSequence {

    private static Long orderNumber = 0L;
    private Order order;

    public final void orderMeal() {
        showMenu();
        order();
        sendOrderToChief();
        prepareMeal();
        deliverMeal();
        payForMeal();
    }

    private void payForMeal() {
        System.out.println("^ realizuję płatność za posiłek ^");
        MobileBankAppFacade mobileBankAppFacade = new MobileBankAppFacade();
        mobileBankAppFacade.makePayment();
    }

    private void order() {
        System.out.print("Zamawiam pozycję numer: ");
        orderNumber++;
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        order = new Order(orderNumber, OrderStatus.ZAMOWIENIE_ZLOZONE, userChoice);
    }

    private void deliverMeal() {
        order.changeOrderStatus(OrderStatus.DOSTARCZONO);
        System.out.println("Posiłek dostarczony!");
        System.out.println(order.getMeal());
    }

    public abstract void showMenu();

    public abstract void sendOrderToChief();

    public abstract void prepareMeal();

    Order getOrder() {
        return order;
    }
}
