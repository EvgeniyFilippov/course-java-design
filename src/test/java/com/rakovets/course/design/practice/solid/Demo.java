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

        Map<String, Integer> ingredientsOfDiablo = new LinkedHashMap<>();
        ingredientsOfDiablo.put("cheese", 120);
        ingredientsOfDiablo.put("pepper", 20);
        ingredientsOfDiablo.put("salt", 10);
        Pizza diablo = new Pizza("Diablo", ingredientsOfDiablo);

        System.out.println(pepperoni.toString());

    }

}
