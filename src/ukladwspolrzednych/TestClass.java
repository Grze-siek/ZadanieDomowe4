package ukladwspolrzednych;

public class TestClass {
    public static void main(String[] args) {
        NewClass p = new NewClass();
        System.out.println(p.segmentLenght(new Segment(new Point(0,1), new Point(2,2))));
        System.out.println(p.isItTriange(new Point(1,2), new Point(5,5), new Point(1,1)));
    }
}
