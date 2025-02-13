package com.mealplangenerator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        VegetarianMeal vegMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();
        HighProteinMeal highProteinMeal = new HighProteinMeal();

        List<MealPlan> allMeals = List.of(vegMeal, veganMeal, highProteinMeal);

        MealPlanGenerator.printAllMeals(allMeals);

        Meal<MealPlan> mealPlan = MealPlanGenerator.generateMealPlan(allMeals);
        mealPlan.printMealDetails();
    }
}
