package Main.Pizzas;

import Main.*;

public class MargheritaDo extends Pizza{

    public MargheritaDo()
    {
        setName("Pizza MargheritaDo");
        addIngredient(new Ingredient("pâte",3));
        addIngredient(new Ingredient("sauce tomate",(float)1.5));
        addIngredient(new Ingredient("fromage",2));
    }
}
