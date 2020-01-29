package triangle;

public class Triangle {
    int angleInDegrees1;
    int angleInDegrees2;
    int angleInDegrees3;

    public Triangle(int angleInDegrees1, int angleInDegrees2, int angleInDegrees3) {
        this.angleInDegrees1 = angleInDegrees1;
        this.angleInDegrees2 = angleInDegrees2;
        this.angleInDegrees3 = angleInDegrees3;

        if (!(angleInDegrees1 + angleInDegrees2 + angleInDegrees3 == 180))
            System.out.println("Trójkąt musi mieć 180 stopni");

    }
}
