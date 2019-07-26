package methodFactory;

import model.Product;
import model.soup.*;

public class SoupMethodFactory extends MethodFactory {
    private static SoupMethodFactory instance;

    private SoupMethodFactory() {
    }

    public static synchronized SoupMethodFactory getInstance() {
        if (instance == null) {
            instance = new SoupMethodFactory();
        }
        return instance;
    }

    @Override
    public Product getProduct(String type) {
        type = type.toLowerCase();
        switch (type) {
            case "borscht":
                return new Borscht();
            case "broth":
                return new Broth();
            case "cold soup":
            case "coldsoup":
                return new ColdSoup();
            case "sour soup":
            case "soursoup":
                return new SourSoup();
            case "tomatoe soup":
            case "tomatoesoup":
                return new TomatoeSoup();
            default:
                throw new UnsupportedOperationException("Nie mamy takiej zupy.");
        }
    }
}
