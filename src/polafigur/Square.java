package polafigur;

public class Square {
    double side;

    public Square(double side) {
        this.side = side;
    }

    double squareArea ()
    {
        return this.side * this.side;
    }
}
