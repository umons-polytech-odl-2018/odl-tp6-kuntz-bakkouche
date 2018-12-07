public class Ingredient implements Food {


    private String name;
    private float price;



    public Ingredient(String name, float price){
         this.name = name;
         this.price = price;
     }

    @Override
     public float getPrice() {
        return price;
    }

    @Override
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "FOOD{" + "name ='" + name +'\'' +",price = " +price +'}';
    }

}
