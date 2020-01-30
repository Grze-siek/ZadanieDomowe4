package ukladwspolrzednych;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    boolean firstQuarter()
    {
        return x > 0 && y > 0;
    }
    boolean secondQuarter()
    {
        return x < 0 && y > 0;
    }
    boolean thirdQuarter()
    {
        return x < 0 && y < 0;
    }
    boolean fourthQuarter()
    {
        return x > 0 && y < 0;
    }
    boolean isPointOnX ()
    {
       return y == 0;
    }
    boolean isPointOnY ()
    {
        return x == 0;
    }
    boolean isPointInTheMiddle ()
    {
        return y == 0 && x == 0;
    }
}
