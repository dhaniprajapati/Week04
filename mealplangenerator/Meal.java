package com.mealplangenerator;

import java.util.ArrayList;
import java.util.List;

public class Meal<T extends MealPlan> {
    private List<T> meals;

    public Meal() {
        meals = new ArrayList<>();
    }

    public void addMeal(T meal) {
        meals.add(meal);
    }

    public List<T> getMeals() {
        return meals;
    }

    public void printMealDetails() {
        for (T meal : meals) {
            System.out.println("Meal Type: " + meal.getMealDetails());
        }
    }
}

