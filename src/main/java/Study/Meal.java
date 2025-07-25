package Study;

public class Meal {
    private String name;
    private int calories;
    private int protein;
    private int carbs;
    private int fats;
    private String mealType;
    public Meal(String name, int calories, int protein, int carbs, int fats,String mealType){
        this.name=name;
        this.calories=calories;
        this.protein=protein;
        this.carbs=carbs;
        this.fats=fats;
        this.mealType=mealType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getCarbs() {
        return carbs;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public int getFats() {
        return fats;
    }

    public void setFats(int fats) {
        this.fats = fats;
    }
}
