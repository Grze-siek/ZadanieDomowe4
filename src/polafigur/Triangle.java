package polafigur;

public class Triangle {
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    double trianglePerimeter ()
    {
        return this.sideA + this.sideB + this.sideC;
    }
}
