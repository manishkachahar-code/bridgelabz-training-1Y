package com.gla.Generic;
interface MealPlan {
    void showPlan();
}

class VegetarianMeal implements MealPlan {
    public void showPlan() {
        System.out.println("Vegetarian Meal: Salad + Fruits");
    }
}

class VeganMeal implements MealPlan {
    public void showPlan() {
        System.out.println("Vegan Meal: Plant-based diet");
    }
}

class KetoMeal implements MealPlan {
    public void showPlan() {
        System.out.println("Keto Meal: Low carbs, high fat");
    }
}

class HighProteinMeal implements MealPlan {
    public void showPlan() {
        System.out.println("High Protein Meal: Eggs + Chicken");
    }
}

class Meal<T extends MealPlan> {
    private T meal;

    Meal(T meal) {
        this.meal = meal;
    }

    public void displayMeal() {
        meal.showPlan();
    }
}

class MealGenerator {

    public static <T extends MealPlan> void generateMeal(T meal) {
        System.out.println("Generating personalized meal plan...");
        meal.showPlan();
    }
}
public class Vegetarian {
    public static void main(String[] args) {


        Meal<VegetarianMeal> m1 = new Meal<>(new VegetarianMeal());
        m1.displayMeal();

        Meal<KetoMeal> m2 = new Meal<>(new KetoMeal());
        m2.displayMeal();


        MealGenerator.generateMeal(new VeganMeal());
        MealGenerator.generateMeal(new HighProteinMeal());
    }
}
