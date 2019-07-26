package orderApp.observer;

import orderApp.model.Order;

public class MobileApp implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("\tMobile APP - zamowienie numer " + order.getOrderNumber() + " zmieniło status na " + order.getOrderStatus());

    }
}
