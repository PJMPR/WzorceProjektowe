package orderApp.observer;

import orderApp.model.Order;

public class Email implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("\tMAIL - zamowienie numer " + order.getOrderNumber() + " zmieniło status na " + order.getOrderStatus());
    }
}
