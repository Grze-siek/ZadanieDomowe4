package ukladwspolrzednych;

public class NewClass {

    double segmentLenght(Segment segment)
    {
        int result = (segment.getPoint2().getX() - segment.getPoint1().getX())^2 + (segment.getPoint2().getY()- segment.getPoint1().getY())^2;
        return Math.sqrt(result);
    }
    boolean isItTriange (Point one, Point two, Point three)
    {
        boolean firstCondition = one.getX() == two.getX() && one.getY() == two.getY() || one.getX() == three.getX() && one.getY() == three.getY() || two.getX() == three.getX() && two.getY() == three.getY();
        boolean secondCondition = one.getX() == two.getX() && one.getX() == three.getX();
        boolean thirdCondition = one.getY() == two.getY() && one.getY() == three.getY();
        return !(firstCondition || secondCondition || thirdCondition);
    }
}
