package section_4_Arrays;

import java.util.ArrayList;

public class ArrayLisfFun {

    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("John");
        namesList.add("Kyle");
        namesList.add("Lokesh");
        namesList.add("joel");
        namesList.add("Priya");

//        for(int i = 0; i< namesList.size(): ++i) {
//            System.out.println(namesList.get(i));
//        }

        // using new syntax of 'for' loop
        for(String name: namesList) {
            System.out.println(name);
        }
    }

}
