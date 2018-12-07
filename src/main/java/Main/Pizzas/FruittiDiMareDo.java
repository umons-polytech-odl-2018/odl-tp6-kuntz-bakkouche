package Main.Pizzas;

import Main.*;

public class FruittiDiMareDo extends Pizza{

    public FruittiDiMareDo()
    {
        super("FruittiDiMare");
        addIngredient(new Ingredient("pâte",3));
        addIngredient(new Ingredient("sauce tomate",(float)1.5));
        addIngredient(new Ingredient("fromage",2));
        addIngredient(new Ingredient("fruits de mer",(float)2.5));
    }
}
