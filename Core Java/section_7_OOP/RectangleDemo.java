package section_7_OOP;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2, 9);

        // Printing the num of Rectangle Objects created
        System.out.println(Rectangle.getNumRectangle());
        Rectangle r3;
        System.out.println("After r3 declared : " + Rectangle.getNumRectangle());
        r3 = new Rectangle(2.5, 6);
        System.out.println("After r3 initialised : " + Rectangle.getNumRectangle());

        // printing areas
        System.out.println(r1.area());
        System.out.println(r2.area());
        System.out.println(r3.area());

        // printing perimeters
        System.out.println(r1.perimeter());
        System.out.println(r2.perimeter());
        System.out.println(r3.perimeter());
    }
}