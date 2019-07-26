package prototype;

public class MainCourse implements Cloneable {
    private String mainCourseName;

    public MainCourse(String mainCourseName) {
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
        return "MainCourse{" +
                "mainCourseName='" + mainCourseName + '\'' +
                '}';
    }

    @Override
    protected MainCourse clone() throws CloneNotSupportedException {
        return (MainCourse) super.clone();
    }
}

