package polafigur;

public class TestClass {
    public static void main(String[] args) {
        Square square = new Square(2);
        Rectangle rectangle = new Rectangle(2,3);
        Circle circle = new Circle(1);
        Triangle triangle = new Triangle(3.5,2.5,1);
        ShapeCalculator sCalc = new ShapeCalculator();
        System.out.println(sCalc.squareArea(square));
        System.out.println(sCalc.circleArea(circle));
        System.out.println(sCalc.rectPerimeter(rectangle));
        System.out.println(sCalc.trianglePerimeter(triangle));
    }
}
