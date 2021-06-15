package com.rakovets.course.design.practice.solid;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<String, Integer> ingredientsOfPepperoni = new LinkedHashMap<>();
        ingredientsOfPepperoni.put("cheese", 100);
        ingredientsOfPepperoni.put("flour", 300);
        ingredientsOfPepperoni.put("salt", 50);
        Pizza pepperoni = new Pizza("Pepperoni", ingredientsOfPepperoni);

        System.out.println(pepperoni.toString());

    }

}
