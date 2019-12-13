public class ShapeFactory {

    // private constructor to prevent instantiation
    private ShapeFactory() {
    }

    public static Shape getShape(String shapeType) {
        switch (shapeType.toLowerCase()) {
            case "circle": {
                return new Circle();
            }
            case "rectangle": {
                return new Rectangle();
            }
            case "square": {
                return new Square();
            }
            default: {
                return null;
            }
        }
    }
}