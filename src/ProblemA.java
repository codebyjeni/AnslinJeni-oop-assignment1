class Recipe {
    String name;
    int cookingTimeMinutes;

    // Constructor
    Recipe(String name, int cookingTimeMinutes) {
        this.name = name;
        this.cookingTimeMinutes = cookingTimeMinutes;
    }

    // Display Recipe details
    void display() {
        System.out.println("Recipe Name: " + name);
        System.out.println("Cooking Time: " + cookingTimeMinutes + " minutes");
    }
}

class VeganRecipe extends Recipe {
    String ingredientList;

    // Constructor
    VeganRecipe(String name, int cookingTimeMinutes, String ingredientList) {
        super(name, cookingTimeMinutes);
        this.ingredientList = ingredientList;
    }

    // Method overriding
    @Override
    void display() {
        super.display();
        System.out.println("Ingredient List: " + ingredientList);
    }
}

public class ProblemA {
    public static void main(String[] args) {

        VeganRecipe recipe = new VeganRecipe(
                "Vegan Pasta",
                30,
                "Pasta, Tomato, Garlic, Olive Oil"
        );

        recipe.display();
    }
}