package section_6_Methods;

public class RecursionDemo {

    public static void main(String[] args) {

        /*
            Working with recursive functions
         */

        countDownFrom(10);

        countUpTo(0, 10);
    }

    private static void countDownFrom(int i) {
        // prints integer from i down to 1 (inclusive)
        if(i == 0) return;
        System.out.println(i);
        countDownFrom(i - 1);
    }

    public static void countUpTo(int startNumber, int endNumber) {
        // prints numbers from startNumber to endNumber (inclusive)
        if(startNumber > endNumber) return;
        System.out.println(startNumber);
        countUpTo(startNumber + 1, endNumber);
    }

}
