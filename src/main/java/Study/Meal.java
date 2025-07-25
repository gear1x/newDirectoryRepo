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

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
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
    public void checkMealQuality(){

        switch(this.mealType)
        {
            case "preworkout": if(this.carbs<=22) {
                System.out.println("This meal sucks chief");
            } else System.out.println("This meal is it chief.");
            case "postworkout": if(this.protein<=30){
                System.out.println("This aint how we get big chief.");
            } else System.out.println("This is it chief we gettin big.");
            case "anabolic": if(this.protein<40){
                System.out.println("You call this ANABOLIC? Stay small I guess.");
            } else System.out.println("We gettin' big gang h*ll yeah.");
            case "cheat":
                System.out.println("Did your mamma raise a b*tch?");
            default:
                throw new IllegalStateException("Unexpected value: " + this.mealType);
        }
    }
}
