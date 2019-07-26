package prototype;

public class Soup implements Cloneable {
    private String mainCourseName;

    public Soup(String mainCourseName) {
        this.mainCourseName = mainCourseName;
    }

    public String getMainCourseName() {
        return mainCourseName;
    }

    public void setMainCourseName(String mainCourseName) {
        this.mainCourseName = mainCourseName;
    }

    @Override
    public String toString() {
        return "Soup{" +
                "mainCourseName='" + mainCourseName + '\'' +
                '}';
    }

    @Override
    protected Soup clone() throws CloneNotSupportedException {
        return (Soup) super.clone();
    }
}
