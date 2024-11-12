package FactoryDesign;

public class Main {
    public static void main(String[] args){
        ShapeFactory shapeMaker = new ShapeFactory();
        Shape actualShape = shapeMaker.getShape("Circle");
        //shapeMaker.getShape("Circle"); this is the cream
        //this is the generator of objects, upon getting any input
        actualShape.draw();
    }
}
