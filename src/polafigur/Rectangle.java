package polafigur;

public class Rectangle {
    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    double rectPerimeter ()
    {
        return 2 * this.sideA + 2 * this.sideB;
    }
}
