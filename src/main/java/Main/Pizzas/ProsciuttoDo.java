package Main.Pizzas;

import Main.*;

public class ProsciuttoDo extends Pizza{

    public ProsciuttoDo() {

        super("Pizza ProsciuttoDo");
        addIngredient(new Ingredient("pâte",3));
        addIngredient(new Ingredient("sauce tomate",(float)1.5));
        addIngredient(new Ingredient("fromage",2));


    }
}
