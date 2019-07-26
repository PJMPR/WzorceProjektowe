package orderApp.utils;

public class Menu {
    public static void printClassicMenu() {
        System.out.println("1. Spaghetti\n" +
                "2. Chop\n" +
                "3. Broth\n");
    }

    public static void printVeganMenu() {
        System.out.println("1. Vegan burger\n" +
                "2. Vegan chop\n" +
                "3. Beans\n");
    }

    public static void printWelcomeInfo() {
        System.out.println("---------------------------------\n" +
                "Witaj w restauracji online\n" +
                "Przygotować menu dla wegan?");
    }
}
