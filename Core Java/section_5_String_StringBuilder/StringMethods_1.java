package section_5_String_StringBuilder;

public class StringMethods_1 {

    public static void main(String[] args) {
        /*
            Working with String class and its methods
         */
        String name1 = "John Baugh";
        String name2 = "John Baugh";
        String name3 = "Rob Percival";

        for(int i = 0; i < name1.length(); ++i) {
            System.out.print(name1.charAt(i) + " ");
        }
        System.out.println();
        if(name1.equals(name2)) {
            System.out.println(name1 + " and " + name2 +"  are equal");
        }
        else {
            System.out.println("Names are not equal");
        }

        if(name1.compareTo(name3) > 0) {
            System.out.println(name1 + " > " + name3);
        }
        else {
            System.out.println(name1 + " <= " + name3);
        }

        String myName = "Sri Charan";

        if(myName.equals(name1)) {
            System.out.println(myName + " and " + name1 +"  are equal");
        }
        else {
            System.out.println(myName + " and " + name1 + " are not equal");
        }

        if(myName.compareTo(name3) > 0) {
            System.out.println(myName + " > " + name3);
        }
        else {
            System.out.println(myName + " <= " + name3);
        }

    }

}
