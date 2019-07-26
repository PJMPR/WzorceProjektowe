package simpleFactory;

import model.Drink;
import model.MainCourse;
import model.Soup;
import model.drink.*;
import model.mainCourse.*;
import model.soup.*;

import java.io.Serializable;

public class SimpleProductFactory implements Serializable {
    private static SimpleProductFactory instance;

    private SimpleProductFactory() {
    }

    public static synchronized SimpleProductFactory getInstance() {
        if (instance == null) {
            instance = new SimpleProductFactory();
        }
        return instance;
    }

    public Drink orderDrink(String type) {
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

    public MainCourse orderMainCource(String type) {
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

    public Soup orderSoup(String type) {
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
