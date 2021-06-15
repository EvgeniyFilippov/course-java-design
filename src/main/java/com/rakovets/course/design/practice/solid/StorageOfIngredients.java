package com.rakovets.course.design.practice.solid;

import java.util.Map;

public class StorageOfIngredients {
    private Map<String, Integer> ingredients;

    public StorageOfIngredients(Map<String, Integer> ingredients) {
        this.ingredients = ingredients;
    }

    public Map<String, Integer> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Map<String, Integer> ingredients) {
        this.ingredients = ingredients;
    }
}
