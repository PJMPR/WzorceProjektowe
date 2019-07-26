package orderApp.templateMethod;

import orderApp.enums.OrderStatus;
import orderApp.methodFactory.ClassicMealFactory;
import orderApp.methodFactory.MethodFactory;
import orderApp.utils.Menu;

public class ClassicOrderMealSequence extends OrderMealSequence {
    private MethodFactory methodFactory;

    @Override
    public void sendOrderToChief() {
        methodFactory = ClassicMealFactory.getInstance();
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
        Menu.printClassicMenu();
    }


}
