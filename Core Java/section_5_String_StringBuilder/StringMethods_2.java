package section_5_String_StringBuilder;

public class StringMethods_2 {

    public static void main(String[] args) {
        /*
            Working with String class and its methods
         */
        String myName = "John Baugh";

        System.out.println("uppercase of " + myName + " : " + myName.toUpperCase());
        System.out.println("lowercase of " + myName + " : " + myName.toLowerCase());

        int whereIsB = myName.indexOf('B');
        System.out.println("B is at index : " + whereIsB);
        String lastName = myName.substring(5);
        System.out.println("Last Name is " + lastName);
    }

}
