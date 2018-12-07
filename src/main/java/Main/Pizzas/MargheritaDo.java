package Main.Pizzas;

import Main.*;

public class MargheritaDo extends Pizza{

    public MargheritaDo()
    {
        super("Pizza Margherita");
        addIngredient(new Ingredient("sauce tomate",(float)1.5));
        addIngredient(new Ingredient("fromage",2));
    }
}
