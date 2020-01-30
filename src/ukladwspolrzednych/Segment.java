package ukladwspolrzednych;

public class Segment {
    private Point point1;
    private Point point2;

    public Segment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    double segmentLenght()
    {
        int result = (point2.getX() - point1.getX())^2 + (point2.getY() - point1.getY())^2;
        return Math.sqrt(result);
    }

}
