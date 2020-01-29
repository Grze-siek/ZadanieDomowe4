package polafigur;

public class ShapeCalculator {

    double squareArea (Square square)
    {
        return square.side * square.side;
    }
    double circleArea (Circle circle)
    {
        return 3.14 * circle.radius * circle.radius;
    }
    double trianglePerimeter (Triangle triangle)
    {
        return triangle.sideA + triangle.sideB + triangle.sideC;
    }
    double rectPerimeter (Rectangle rectangle)
    {
        return rectangle.sideA + rectangle.sideB;
    }
}
