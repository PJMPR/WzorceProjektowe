package methodFactory;

import model.Product;

public abstract class MethodFactory {
    public abstract Product getProduct(String type);

    public String orderProduct(String type) {
        return getProduct(type).order();
    }
}
