package section_2_LambdasSyntax;

public class LambdaScope extends SuperScope {

    private final String lambdaScopeMember = "LAMBDA_SCOPE";
    interface Printer {
        void print(String member);
    }

    public void printAllMembers(String localVariable) {
        System.out.println("Local Variable : " + localVariable);
        System.out.println("Lambda Scope Member : " + this.lambdaScopeMember);
        System.out.println("Super Scope Member : " + super.superScopeMenber);

        System.out.println();

        Printer printer = (printerVariable) -> {
            System.out.println("Local printer variable : " + printerVariable);
            System.out.println("Local Variable : " + localVariable);
            System.out.println("Lambda Scope Member : " + this.lambdaScopeMember);
            System.out.println("Super Scope Member : " + super.superScopeMenber);
        };

        printer.print("PRINTER_VARIABLE");

    }

    public static void main(String[] args) {
        new LambdaScope().printAllMembers("LOCAL_VARIABLE");
    }

}
