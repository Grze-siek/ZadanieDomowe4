package polafigur;

public class TestClass {
    public static void main(String[] args) {
        Square square = new Square(2);
        Rectangle rectangle = new Rectangle(2,3);
        Circle circle = new Circle(1);
        Triangle triangle = new Triangle(3.5,2.5,1);
        double sqrArea = square.squareArea();
        double rectPerimeter = rectangle.rectPerimeter();
        double circArea = circle.circleArea();
        double trianPerimeter = triangle.trianglePerimeter();
        System.out.println(sqrArea);
        System.out.println(rectPerimeter);
        System.out.println(circArea);
        System.out.println(trianPerimeter);
    }
}
