package section_6_Methods;

public class MethodsDemo {

    public static void main(String[] args) {
        /*
            using various methods
         */
        printHello();
        int result = giveMeTen();
        printNumber(result);
        result = addThem(3, 4);
        printNumber(result);
        System.out.println(square(3));
    }

    private static double square(double number) {
        return number * number;
    }

    private static void printHello() {
        System.out.println("Hello");
    }

    public static int addThem(int a, int b) {
        return a + b;
    }

    public static void printNumber(int a) {
        System.out.println(a);
    }

    public static int giveMeTen() {
        return 10;
    }

}
