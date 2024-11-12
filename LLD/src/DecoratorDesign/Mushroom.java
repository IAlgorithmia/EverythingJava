package DecoratorDesign;

public class Mushroom extends ToppingDecorator {

    BasePizza pizza;

    Mushroom(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost(){
        return this.pizza.cost() + 15;
    }
}
