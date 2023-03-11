package section_2_LambdasSyntax;

public class CapturingLambda {

    @FunctionalInterface
    public interface Greeting {
        void greet();
    }

    public void greet(Greeting greeting) {
        greeting.greet();
    }

    public static void main(String[] args) {

        String name = "Sri Charan";
        String finalName = name;
        new CapturingLambda().greet(() -> System.out.println("Hello, " + finalName));
        name = "djd";
    }

}
