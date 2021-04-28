public class Point
{
    public static void main(String[] args)
    {
        Point1 P1 = new Point1(1, 3);
        Point2 P2 = new Point2(6, 4);
        System.out.println(rasstoyanie(P1, P2));
    }
    public static double rasstoyanie(Point1 P1, Point2 P2)
    {
        return Math.sqrt((P2.x2 - P1.x1) * (P2.x2 - P1.x1) + (P2.y2 - P1.y1) * (P2.y2 - P1.y1));
    }
}
