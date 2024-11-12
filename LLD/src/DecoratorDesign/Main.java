package DecoratorDesign;

public class Main {
    public static void main(String[] args){
        BasePizza myPizza = new ExtraCheese(new FarmHouse());
        System.out.println(myPizza.cost());
        myPizza = new Mushroom(myPizza);
        myPizza = new ExtraCheese(myPizza);
        System.out.println(myPizza.cost());
    }
}
