package Main;

import java.util.ArrayList;

public abstract class Pizza implements Food {

    String name;
    ArrayList<Ingredient> ingredients;

    protected Pizza()
    {
        name = null;
        ingredients = new ArrayList<>();
    }
    public Pizza(String name)
    {
        this.name = name;

        ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient)
    {
        this.ingredients.add(ingredient);
    }

    @Override
    public float getPrice()
    {
        float price = 0;
        for(Ingredient i : ingredients)
        {
            price += i.getPrice();
        }
        return price;
    }


    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "Pizza " + name;
    }
}
