package triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle t = new Triangle(60, 60, 60);
        RightTriangle rt = new RightTriangle();
        System.out.println(rt.isRightTriangle(t));
    }
}
