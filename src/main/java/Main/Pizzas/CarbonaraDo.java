package Main.Pizzas;

import Main.*;

public class CarbonaraDo extends Pizza{

    public CarbonaraDo()
    {
        super("Carbonara");
        addIngredient(new Ingredient("pâte",3));
        addIngredient(new Ingredient("crème blanche",(float)1.5));
        addIngredient(new Ingredient("fromage",2));
        addIngredient(new Ingredient("jambon",2));
    }
}
