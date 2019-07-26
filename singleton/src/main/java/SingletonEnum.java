public enum SingletonEnum {
    INSTANCE();

    private int value = 100;
    private String name = "";

    private SingletonEnum() {
    }
}
