package section_7_OOP;

public class CircleDemo {

    public static  void main(String[] args) {

        Circle firstCircle =  new Circle();
        Circle secondCircle =  new Circle(5);
        Circle thirdCircle =  new Circle(12.75);

        // printing circles' data
        printCircleData(firstCircle);
        printCircleData(secondCircle);
        printCircleData(thirdCircle);

    }

    public static void printCircleData(Circle circle) {
        System.out.println("r : " + circle.getRadius());
        System.out.println("c : " + String.format("%.2f",circle.circumference()));
        System.out.println("a : " + String.format("%.2f",circle.area()));
        System.out.println();
    }

}
