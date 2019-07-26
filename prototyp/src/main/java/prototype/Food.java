package prototype;

public class Food implements Cloneable {
    private String foodName;
    private MainCourse mainCourse;
    private Soup soup;

    public Food(String foodName, MainCourse mainCourse, Soup soup) {
        this.foodName = foodName;
        this.mainCourse = mainCourse;
        this.soup = soup;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public MainCourse getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(MainCourse mainCourse) {
        this.mainCourse = mainCourse;
    }

    public Soup getSoup() {
        return soup;
    }

    public void setSoup(Soup soup) {
        this.soup = soup;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodName='" + foodName + '\'' +
                ", mainCourse=" + mainCourse +
                ", soup=" + soup +
                '}';
    }

    @Override
    protected Food clone() throws CloneNotSupportedException {
        Food food = (Food) super.clone();
        food.mainCourse = mainCourse.clone();
        food.soup = soup.clone();
        return food;
    }
}
