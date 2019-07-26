package orderApp.observer;

import orderApp.model.Order;

public interface Observer {
    void update(Order order);
}
