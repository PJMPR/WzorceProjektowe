package orderApp.templateMethod;

import orderApp.enums.OrderStatus;
import orderApp.methodFactory.MethodFactory;
import orderApp.methodFactory.VeganMealFactory;
import orderApp.utils.Menu;

public class VeganOrderMealSequence extends OrderMealSequence {
    MethodFactory methodFactory;

    @Override
    public void sendOrderToChief() {
        methodFactory = VeganMealFactory.getInstance();
        super.getOrder().changeOrderStatus(OrderStatus.PRZYGOTOWYWANIE);
    }

    @Override
    public void prepareMeal() {
        super.getOrder().setMeal(methodFactory.orderMeal(super.getOrder().getMealNumber()));
        super.getOrder().changeOrderStatus(OrderStatus.PRZYGOTOWANO);
    }

    @Override
    public void showMenu() {
        System.out.println("MENU");
        Menu.printVeganMenu();
    }
}
