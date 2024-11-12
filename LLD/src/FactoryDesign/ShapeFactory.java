package FactoryDesign;

public class ShapeFactory {

    Shape getShape(String shapeRequired){
        //Enhanced switch, language getting better
        return switch (shapeRequired) {
            case "Circle" -> new Circle();
            case "Rectangle" -> new Rectangle();
            default -> null;
        };
    }
}
