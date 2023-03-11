package section_5_String_StringBuilder;

public class StringBuilderFun {

    public static void main(String[] args) {

        /*
            Working with StringBuilder class and its methods for string manipulation
         */

        StringBuilder sb = new StringBuilder("John Baugh");

        sb.append(" is awesome");
        System.out.println(sb);

        sb.insert(5, "Phillip ");
        System.out.println(sb);

        int idx = sb.indexOf("awesome");
        sb.replace(idx, idx + "awesome". length(), "amazing");
        System.out.println(sb);

        idx = sb.indexOf("Phillip");
        sb.delete(idx, idx + 7);
        System.out.println(sb);

        idx = sb.indexOf("John");
        sb.replace(idx, idx + 4, "Dr.");
        System.out.println(sb);

    }

}
