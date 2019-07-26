package orderApp.model;

import orderApp.enums.OrderStatus;
import orderApp.observer.Email;
import orderApp.observer.MobileApp;
import orderApp.observer.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable {
    private Long orderNumber;
    private OrderStatus orderStatus;
    private Set<Observer> registerObserver = new HashSet<>();

    private Meal meal;
    private int mealNumber;

    public Order(Long orderNumber, OrderStatus orderStatus, int mealNumber) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
        this.mealNumber = mealNumber;
        registerObserver.add(new Email());
        registerObserver.add(new MobileApp());
        this.notifyObservers();
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public int getMealNumber() {
        return mealNumber;
    }

    public void setMealNumber(int mealNumber) {
        this.mealNumber = mealNumber;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    private void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public void notifyObservers() {
        System.out.println("--> POWIADOMIENIA");
        for (Observer o : registerObserver) {
            o.update(this);
        }
    }

    public void changeOrderStatus(OrderStatus orderStatus) {
        setOrderStatus(orderStatus);
        notifyObservers();
    }
}
