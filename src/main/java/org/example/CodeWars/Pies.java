package org.example.CodeWars;


import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        Map<String, Integer> recipe = new HashMap();
        Map<String, Integer> availabe = new HashMap();

        recipe.put("flour", 100);
        recipe.put("sugar", 50);
        recipe.put("egss", 10);


        availabe.put("flour", 3000);
        availabe.put("sugar", 1200);
        availabe.put("egss", 60);
        availabe.put("milk", 10);

        Map<String, Integer> recipeTwo = new HashMap<>();
        recipeTwo.put("flour", 500);
        recipeTwo.put("sugar", 200);
        recipeTwo.put("egss", 1);
        recipeTwo.put("cinnamon", 300);

        Map<String, Integer> availableTwo = new HashMap<>();

        availableTwo.put("flour", 1200);
        availableTwo.put("sugar", 1200);
        availableTwo.put("egss", 1);
        availableTwo.put("milk", 200);


        System.out.println(cakes(recipe, availabe));
        System.out.println(cakes(recipeTwo, availableTwo));
        System.out.println(cakesStream(recipeTwo, availableTwo));
        System.out.println(cakesStream(recipeTwo, availableTwo));

    }

    public static int cakesStream(Map<String, Integer> recipe, Map<String, Integer> available){
        return recipe.entrySet().stream().mapToInt(e -> available.getOrDefault(e.getKey(), 0) / e.getValue()).min().orElse(0);
    }


    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        int minCakes = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entryRecipe : recipe.entrySet()) {
            String ingredient = entryRecipe.getKey();
            int requiredAmount = entryRecipe.getValue();

            if (!available.containsKey(ingredient) || available.get(ingredient) < requiredAmount) {
                return 0; // Если ингредиента нет или его меньше, чем нужно, не можем сделать ни одного пирога
            }

            int possibleCakes = available.get(ingredient) / requiredAmount;
            if (possibleCakes < minCakes) {
                minCakes = possibleCakes;
            }
        }

        return minCakes;
     }
}