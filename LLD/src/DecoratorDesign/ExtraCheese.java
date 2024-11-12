package DecoratorDesign;

public class ExtraCheese extends ToppingDecorator {
    BasePizza pizza;

    ExtraCheese(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost(){
        return this.pizza.cost() + 10;
    }
}
