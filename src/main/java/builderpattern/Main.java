package builderpattern;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder(12)
                              .withCrust("thin")
                              .withSauce("tomato")
                              .withToppings(Arrays.asList("cheese", "pepperoni", "mushrooms"))
                              .build();
        System.out.println(pizza);
    }

}
