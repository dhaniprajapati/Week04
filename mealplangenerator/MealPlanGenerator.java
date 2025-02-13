package com.mealplangenerator;

import java.util.List;
import java.util.List;

public class MealPlanGenerator {

    public static <T extends MealPlan> boolean validateMeal(T meal) {
        return meal.getMealDetails() != null && !meal.getMealDetails().isEmpty();
    }

    public static <T extends MealPlan> Meal<T> generateMealPlan(List<T> mealTypes) {
        Meal<T> mealPlan = new Meal<>();
        for (T meal : mealTypes) {
            if (validateMeal(meal)) {
                mealPlan.addMeal(meal);
            }
        }
        return mealPlan;
    }

    public static void printAllMeals(List<? extends MealPlan> mealPlans) {
        for (MealPlan meal : mealPlans) {
            System.out.println(meal.getMealDetails());
        }
    }
}
