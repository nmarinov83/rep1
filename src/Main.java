
import Recipe.Recipe;

public class Main {
    public static void main(String[] args) {



        Recipe.addIngredient("flour", 500.0);
        Recipe.addIngredient("water", 400.0);
        Recipe.addIngredient("salt", 5.0);
        Recipe.addIngredient("east", 5.0);



        Recipe.name = "Pancakes";

        Recipe.addIngredient("flour", 200.0);
        Recipe.addIngredient("milk", 200.0);
        Recipe.addIngredient("egg", 2.0);
        Recipe.addIngredient("baking-powder", 2.0);
        Recipe.addIngredient("oil", 20.0);


        Recipe.addPreCookStep("1.Mix eggs and oil");
        Recipe.addPreCookStep("2.Add Flour and mix");
        Recipe.addPreCookStep("3.Add backing-powder");
        Recipe.addPreCookStep("4.Add Milk");

        System.out.println(Recipe.viewIngredients());


        System.out.println(Recipe.viewRecipe());
    }
}