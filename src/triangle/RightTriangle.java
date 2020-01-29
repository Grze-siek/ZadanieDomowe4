package triangle;

public class RightTriangle {

    boolean isRightTriangle(Triangle triangle)
    {

        return triangle.angleInDegrees1 == 90 || triangle.angleInDegrees2 == 90 || triangle.angleInDegrees3 == 90;

    }
}
