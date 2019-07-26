package methodFactory;

import model.Product;
import model.drink.*;

import java.io.Serializable;

public class DrinkMethodFactory extends MethodFactory implements Serializable {
    private static DrinkMethodFactory instance;

    private DrinkMethodFactory() {
    }

    public static synchronized DrinkMethodFactory getInstance() {
        if (instance == null) {
            instance = new DrinkMethodFactory();
        }
        return instance;
    }

    @Override
    public Product getProduct(String type) {
        type = type.toLowerCase();
        switch (type) {
            case "beer":
                return new Beer();
            case "cocacola":
            case "coca cola":
                return new CocaCola();
            case "juice":
                return new Juice();
            case "water":
                return new Water();
            case "wine":
                return new Wine();
            default:
                throw new UnsupportedOperationException("Nie mamy takiego napoju.");
        }
    }
}
