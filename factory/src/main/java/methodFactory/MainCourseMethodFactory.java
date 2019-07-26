package methodFactory;

import model.Product;
import model.mainCourse.*;

public class MainCourseMethodFactory extends MethodFactory {
    private static MainCourseMethodFactory instance;

    private MainCourseMethodFactory() {
    }

    public static synchronized MainCourseMethodFactory getInstance() {
        if (instance == null) {
            instance = new MainCourseMethodFactory();
        }
        return instance;
    }

    @Override
    public Product getProduct(String type) {
        type = type.toLowerCase();
        switch (type) {
            case "dumplings":
                return new Dumplings();
            case "kebab":
                return new Kebab();
            case "paupiette":
                return new Paupiette();
            case "pizza":
                return new Pizza();
            case "porkchop":
            case "pork chop":
                return new PorkChop();
            default:
                throw new UnsupportedOperationException("Nie mamy takiego dania glownego.");
        }
    }
}
