
package Recipe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




    public class Recipe {



        public static String name;


        static Map<String, Double> ingredientsList = new HashMap<>();
        static List<String> preCookSteps = new ArrayList<>();


        public static void addIngredient(String s, Double d) {
            ingredientsList.put(s, d);
        }

        public static void addPreCookStep(String step) {

            preCookSteps.add(step);
        }


        public static String viewIngredients() {
            return ("Needed ingredients for "+name + ingredientsList);
        }
        public static String viewRecipe() {
            return "Reccipe for "+name + "\n" +
                    "Needed ingredients" + ingredientsList + "\n"+ preCookSteps;
        }


    }




