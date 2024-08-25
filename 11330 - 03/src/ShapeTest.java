public class ShapeTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get a Square and draw it
        Shape square = shapeFactory.getShape("SQUARE");
        System.out.println("Drawing Square:");
        square.draw();

        // Get a Circle and draw it
        Shape circle = shapeFactory.getShape("CIRCLE");
        System.out.println("\nDrawing Circle:");
        circle.draw();

        // Get a Triangle and draw it
        Shape triangle = shapeFactory.getShape("TRIANGLE");
        System.out.println("\nDrawing Triangle:");
        triangle.draw();

        // Get a Rectangle and draw it
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        System.out.println("\nDrawing Rectangle:");
        rectangle.draw();
    }}
