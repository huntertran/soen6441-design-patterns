public class FactoryDriver {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("CIRCLE");
        shape.draw();
    }
}