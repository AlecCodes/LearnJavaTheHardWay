public class RectangleDriver{
    public static void main( String[] args ){
        Rectangle r = new Rectangle(10, 5);
        System.out.println("The area is " + r.getArea());
        Rectangle r2 = new Rectangle(3,5);
        System.out.println(r2.getArea());
    }
}