package com.rakovets.course.design.practice.solid;

import java.util.Map;

public class Pizza {
    private String pizzaName;
    private Map<String, Integer> ingredients;

    public Pizza(String pizzaName, Map<String, Integer> ingredients) {
        this.pizzaName = pizzaName;
        this.ingredients = ingredients;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public Map<String, Integer> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Map<String, Integer> ingredients) {
        this.ingredients = ingredients;
    }
}
